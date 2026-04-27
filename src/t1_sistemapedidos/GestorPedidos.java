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
public class GestorPedidos {
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public void crearPedido(Pedido p) {
        listaPedidos.add(p);
    }
    public void listarPedidos() {
        int i = 1;
        for (Pedido p : listaPedidos) {
            System.out.println("Pedido #" + i);
            System.out.println("Total: " + p.calcularTotal());
            i++;
        }
    }
    
}
