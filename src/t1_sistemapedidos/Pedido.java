/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_sistemapedidos;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Pedido {
    ArrayList<DetallePedido> listaDetalles = new ArrayList<>();

    public void agregarDetalle(DetallePedido dp) {
        listaDetalles.add(dp);
    }

    public double calcularTotal() {
        if (listaDetalles.isEmpty()) {
            System.out.println("El pedido está vacío, no se puede calcular el total.");
            return 0;
        }

        double total = 0;
        for (DetallePedido dp : listaDetalles) {
            total += dp.calcularSubtotal();
        }
        return total;
    }
    
}
