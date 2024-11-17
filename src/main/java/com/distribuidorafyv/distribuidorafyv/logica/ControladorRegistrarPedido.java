package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Cliente;
import com.distribuidorafyv.distribuidorafyv.modelo.Pedido;
import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import com.distribuidorafyv.distribuidorafyv.modelo.DetallePedido;
import com.distribuidorafyv.distribuidorafyv.modelo.PedidoJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.ProductoJpaController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.PersistenceException;

public class ControladorRegistrarPedido {
    
    private PedidoJpaController pedidoJpa = new PedidoJpaController();
    
    private ProductoJpaController prodJpa = new ProductoJpaController();
     public ControladorRegistrarPedido() {       
       
    }
   
    // Constructor con inyección de dependencias
    public ControladorRegistrarPedido(PedidoJpaController pedidoJpa) {       
        this.pedidoJpa = pedidoJpa;
    }
       

    private List<DetallePedido> detalles = new ArrayList<>();
    private double totalPedido = 0.0;
    
    public Cliente buscarCliente(int dni) {
        return Cliente.buscarPorDni(dni);
    }
    
    public Producto buscarProducto(String codigo) throws IllegalArgumentException {
        try {
            int codigoProducto = Integer.parseInt(codigo);
            ControladoraConsultarProducto controladoraProd = new ControladoraConsultarProducto();
            Producto producto = controladoraProd.obtenerProductoIndividual(codigoProducto);
            if (producto == null) {
                throw new IllegalArgumentException("Producto no encontrado");
            }
            return producto;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Código de producto inválido");
        }
    }
    
    public Cliente buscarCliente (String dniStr) throws IllegalArgumentException {
        try {
            int dni = Integer.parseInt(dniStr);
            ControladoraConsultarCliente controladoraCli = new ControladoraConsultarCliente();
            Cliente cliente = controladoraCli.obtenerClienteIndividual(dni);
            if (cliente == null) {
                throw new IllegalArgumentException("Cliente no encontrado");
            }
            return cliente;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Cliente inválido");
        }
    }

    
    public DetallePedido crearDetallePedido(Producto producto, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        double precioUnitario = producto.getPrecio();
        DetallePedido detalle = new DetallePedido(producto, cantidad, precioUnitario);
        detalles.add(detalle);
        totalPedido += (precioUnitario * cantidad);
        return detalle;
    }
    

    
public void registrarPedido(String dniCliente, List<DetallePedido> detalles) throws IllegalArgumentException {
    try {
        validarPedido(dniCliente);
        int dni = Integer.parseInt(dniCliente);
        Pedido pedido = new Pedido(0, calcularTotal(detalles), dni); // Calcula el total aquí
        
        for (DetallePedido detalle : detalles) {
            detalle.setPedido(pedido);
            pedido.agregarDetalle(detalle);
        }

        // Intentar crear el pedido en la base de datos
        pedidoJpa.create(pedido);
        
        for (DetallePedido detalle : detalles) {
            Producto producto = detalle.getProducto(); // Asumiendo que tienes un método para obtener el producto
            int cantidadSolicitada = detalle.getCantidad(); // Asumiendo que tienes un método para obtener la cantidad
            
            // Verificar si hay suficiente stock
            if (producto.getStock() < cantidadSolicitada) {
                throw new IllegalArgumentException("No hay suficiente stock para el producto: " + producto.getNombre());
            }
            
            // Actualizar el stock
            producto.setStock(producto.getStock() - cantidadSolicitada);
            // Persistir el cambio en el stock en la base de datos
            prodJpa.edit(producto); 
        }
        
    } catch (IllegalArgumentException e) {
        System.err.println("Error de validación: " + e.getMessage());
        throw e; 
    } catch (PersistenceException e) {
        // Manejo de excepciones de persistencia
        System.err.println("Error al registrar el pedido en la base de datos: " + e.getMessage());
        throw new RuntimeException("Error al registrar el pedido. Intente nuevamente más tarde.", e);
    } catch (Exception e) {
        System.err.println("Error inesperado: " + e.getMessage());
        throw new RuntimeException("Error inesperado. Intente nuevamente más tarde.", e);
    } finally {
        limpiarPedidoActual();
    }
}

// Método para calcular el total basado en los detalles
private double calcularTotal(List<DetallePedido> detalles) {
    double total = 0.0;
    for (DetallePedido detalle : detalles) {
        total += detalle.getCantidad() * detalle.getPrecioUnitario();
    }
    return total;
}
    

    private void validarPedido(String dniCliente) {
        if (detalles.isEmpty()) {
            throw new IllegalArgumentException("Debe agregar al menos un producto");
        }
        if (dniCliente == null || dniCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe ingresar el DNI del cliente");
        }
        try {
            Integer.parseInt(dniCliente);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("DNI inválido");
        }
    }
     
    private void limpiarPedidoActual() {
        detalles.clear();
        totalPedido = 0.0;
    }
     
    //Getters
    public double getTotalPedido() {
        return totalPedido;
    }
     
    public List<DetallePedido> getDetalles() {
        return new ArrayList<>(detalles);
    }
}