package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Cliente;
import com.distribuidorafyv.distribuidorafyv.modelo.Pedido;
import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import com.distribuidorafyv.distribuidorafyv.modelo.DetallePedido;
import java.util.ArrayList;
import java.util.List;

public class ControladorRegistrarPedido {
    
    //Atributos
    private int numeroPedidoActual = 1;
    private List<DetallePedido> detalles = new ArrayList<>();
    private double totalPedido = 0.0;
    
    public Cliente buscarCliente(int dni) {
        return Cliente.buscarPorDni(dni);
    }
    
    public Producto buscarProducto(String codigo) throws IllegalArgumentException {
        try {
            int codigoProducto = Integer.parseInt(codigo);
            Producto producto = Producto.buscarPorCodigo(codigoProducto);
            if (producto == null) {
                throw new IllegalArgumentException("Producto no encontrado");
            }
            return producto;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Código de producto inválido");
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
    
    public void quitarDetalle(int indice) {
        if (indice >= 0 && indice < detalles.size()) {
            DetallePedido detalle = detalles.get(indice);
            totalPedido -= (detalle.getPrecioUnitario() * detalle.getCantidad());
            detalles.remove(indice);
        }
    }
    
    public void registrarPedido(String dniCliente) throws IllegalArgumentException {
        validarPedido(dniCliente);
        int dni = Integer.parseInt(dniCliente);
        Pedido pedido = new Pedido(numeroPedidoActual++, totalPedido, dni);
        for(DetallePedido detalle : detalles) {
            pedido.agregarDetalle(detalle);
        }
        limpiarPedidoActual();
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