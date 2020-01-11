/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author STALIN RIVERA, DENNIS PARRA, JORGE RAMOS y MATHYWS RODRIGUEZ
 */
public class Tienda {
    String nombrePr;
    int stock;
    float precio;
 
    public Tienda() {
        solicitarNombrePro();
        solicitarStockPro();
        solicitarPrecioPro();
    }
 
    public static int solicitarProductos() {
        int numeroPro;
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("¿Cuantos productos desea comprar de Alta");
 
        numeroPro = teclado.nextInt();
        return numeroPro;
    }
    public void solicitarNombrePro(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("------Producto--------");
        System.out.println("Introduce el nombre del producto: ");
        nombrePr = teclado.nextLine();
    }
 
    public void solicitarStockPro(){
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduce el stock de: " + devolverNombre() + " : ");
        stock = teclado.nextInt();
    }
 
    public void solicitarPrecioPro(){
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Introduce el precio de: " + devolverNombre() + " : ");
        precio = teclado.nextFloat();
    }
 
    public String devolverNombre(){
        return nombrePr;
    }
    public float devolverPrecio(){
        return precio;
    }
    public int devolverStok(){
        return stock;
    }
    public void modificarStock(int sto){
        stock = stock -sto;
        System.out.println("Venta realizada.");
    }
    public boolean quedaStock(int sto){
 
        if (stock >= sto) {
 
            return true;
 
        } else {
 
            System.err.println("Error solo. Quedan " + stock + " unidades");
 
            return false;
        }
    }
    public static void menuEntrada (ArrayList <Tienda> productos) {
        int opcion;
 
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("FastPay");
            System.out.println("");
            System.out.println("Precione 1 para agregar una lista de productos");
            System.out.println("Precione 2 para mostrar los productos que se agrego");
            System.out.println("Precione 3 para salir ");
            opcion = teclado.nextInt();
 
            switch (opcion) {
                case 1: {
                    menuProductos(productos);
                    break;
                }
                case 2: {
                    menuVentas(productos);
                    break;
                }
                case 3: {
                    System.out.println("Gracias!!! por usar el programa");
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }
            }
 
        } while (opcion != 3);
 
 
    }
 
    public static void menuProductos(ArrayList<Tienda> productos) {
        String respuesta = "no";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("******Menu para la venta de los productos******");
 
            productos.add(new Tienda());
 
            System.out.println("En el caso de que desee agregar otro producto presione si");
            respuesta = teclado.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
 
    }
 
    public static void menuVentas(ArrayList<Tienda> productos) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int unidades=0;
        String respuesta;
        double factura = 0;
        do {
            System.out.println("--Menu de venta de productos--");
            System.out.println("");
 
            for (int i = 0; i < productos.size(); i++) {
                System.out.println("Pulse " + i + " Para comprar " + productos.get(i).devolverNombre() + " cuyo precio es de " + productos.get(i).devolverPrecio() + " y el stock es de " + productos.get(i).devolverStok() + " unidades");
            }
 
            opcion = teclado.nextInt();
 
            System.out.println("Ha elegido comprar " + productos.get(opcion).devolverNombre());
 
            for (int i = opcion; i < productos.size(); i++) {
 
                unidades = unidades(productos);
 
                if (productos.get(i).quedaStock(unidades) == true) {
                    productos.get(i).modificarStock(unidades);
                     unidades = (int) (unidades * productos.get(i).devolverPrecio());
                }
                break;
            }
 
            factura = factura + unidades;
 
            System.out.println("Desea comprar otro producto(si/no)");
            respuesta = teclado.next();
 
        } while (respuesta.equalsIgnoreCase("si"));
 
        System.out.println("El total de su compra es: " + factura + ".");
 
    }
 
    public static int unidades(ArrayList<Tienda> productos) {
        Scanner teclado = new Scanner(System.in);
        int unidades;
 
        System.out.println("Cuantas unidades desea");
        unidades = teclado.nextInt();
 
        return unidades;
    }
 
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        ArrayList<Tienda> productos = new ArrayList<>();
 
        menuEntrada(productos);
 
    }
    
}
