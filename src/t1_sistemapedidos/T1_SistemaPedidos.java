/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_sistemapedidos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class T1_SistemaPedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorPedidos gestor = new GestorPedidos();

        Pedido pedido = new Pedido();

        System.out.println("=== REGISTRO DE PEDIDO ===");

        while (true) {
            System.out.print("Nombre del plato (o 'salir'): ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("salir")) break;

            if (nombre.isEmpty()) {
                System.out.println("Error: el nombre no puede estar vacío.");
                continue;
            }

            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            if (precio <= 0) {
                System.out.println("Error: el precio debe ser mayor a 0.");
                sc.nextLine();
                continue;
            }

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            if (cantidad <= 0) {
                System.out.println("Error: la cantidad debe ser mayor a 0.");
                sc.nextLine();
                continue;
            }

            sc.nextLine(); // limpiar buffer

            Plato plato = new Plato(nombre, precio);
            DetallePedido dp = new DetallePedido(plato, cantidad);
            pedido.agregarDetalle(dp);

            System.out.println("Plato agregado correctamente.\n");
        }

        gestor.crearPedido(pedido);

        System.out.println("\n=== LISTA DE PEDIDOS ===");
        gestor.listarPedidos();
    }
        // TODO code application logic here
}
    
