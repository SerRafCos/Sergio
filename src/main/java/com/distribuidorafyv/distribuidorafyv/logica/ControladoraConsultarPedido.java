
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.DetallePedido;
import com.distribuidorafyv.distribuidorafyv.modelo.DetallePedidoJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.Pedido;
import com.distribuidorafyv.distribuidorafyv.modelo.PedidoJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraConsultarPedido {
    
   private PedidoJpaController pedidoJpa = new PedidoJpaController();
   
   private DetallePedidoJpaController detalleJpa = new DetallePedidoJpaController();

    public ControladoraConsultarPedido() {
    }

    public ControladoraConsultarPedido(PedidoJpaController prodJpa) {
       this.pedidoJpa = pedidoJpa;
    }

   public List<Pedido> obtenerPedido() {
        return pedidoJpa.findAll();
    }   
   
   public List<DetallePedido> obtenerDetallePedido(int idPedido) {
        return detalleJpa.findDetallePedidoEntities(idPedido);
    }   

   
   public void eliminarLogicamentePedido(int nroPedido) {
        
        Pedido pedido = pedidoJpa.findPedidoInhabilitacion(nroPedido);
        if (pedido != null) {
            pedido.setActivo(0); // Marcar como inactivo
            try {
                pedidoJpa.edit(pedido); // Guardar los cambios
            } catch (Exception ex) {
                Logger.getLogger(ControladoraConsultarPedido.class.getName()).log(Level.SEVERE, "Error al cancelar el pedido: " + nroPedido, ex);
            }           
        } else {
            Logger.getLogger(ControladoraConsultarPedido.class.getName()).log(Level.INFO, "Pedido no encontrado para inhabilitar: " + nroPedido);
        }
        
    }

}
