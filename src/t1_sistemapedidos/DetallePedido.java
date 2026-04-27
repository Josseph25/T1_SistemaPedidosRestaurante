/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_sistemapedidos;

/**
 *
 * @author User
 */
public class DetallePedido {
    Plato plato;
    int cantidad;

    public DetallePedido(Plato plato, int cantidad) {
        this.plato = plato;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return plato.precio * cantidad;
    }
    
}
