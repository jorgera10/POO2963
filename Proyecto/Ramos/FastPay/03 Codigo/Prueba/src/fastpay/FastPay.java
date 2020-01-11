/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastpay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author STALIN RIVERA,DENNIS PARRA, JORGE RAMOS, MATITISXD RODRIGUEZ
 */
public class FastPay {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int opcion;
        int saldo = 1000;
        do {

            System.out.println("*********Menu de opciones*******");
            System.out.println("1.- Ver lista de productos");
            System.out.println("2.- Ver saldo en la cuenta");
            System.out.println("3.- Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Lista de productos: ");
                    List<String> list = new ArrayList<String>();

                    list.add("1. Abarrotes");
                    list.add("2. Productos enlatados");
                    list.add("3. Lacteos");
                    list.add("4. Botanas");
                    list.add("5. Confiteria/Dulceria");
                    list.add("6. Harinas/Pan");
                    list.add("7. Frutas y verduras");
                    list.add("8. Bebidas");
                    list.add("9. Bebidas alcoholicas");
                    
                    list.size();

                    for (int i = 0; i <= list.size() - 1; i++) {
                        System.out.println(list.get(i));
                    }
                    opcion = read.nextInt();
                    

                    break;

                case 2:
                    System.out.println("Su saldo en la cuenta es de: " + saldo);

                default:

                    break;
            }

        } while (opcion != 3);
        System.out.println("Gracias por usar nuestro servicio");
    }
}
