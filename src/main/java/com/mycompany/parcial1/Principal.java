package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<Producto> inventario;

    public static void main(String[] args) {
        // TODO: Aquí ingresas tu código para iniciar la aplicación.
        inventario = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Principal principal = new Principal();

        Producto telefono = new Telefono("Iphone", "Telefono moderno", 25000, 6);
        Producto laptop = new Laptop("HP", "Gamer ", 45000, 10);
        Producto accesorio = new Accesorio("Audifonos", "Inalambricos", 10000, 20);

        int opcion;

        do {

            System.out.println("Ingrese la opción deseada: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case '1':

                    principal.agregarDispositivo(laptop);
                    principal.agregarDispositivo(telefono);
                    principal.agregarDispositivo(accesorio);

                    break;

                case '2':

                    principal.mostrarDispositivo();

                    break;
                default:

                case '3':

                    break;
                    
            }
        } while (true);

    }

    public void agregarDispositivo(Producto device) {
        inventario.add(device);
    }

    public void mostrarDispositivo() {
        for (Producto producto : inventario) {
            System.out.println("El dispositivo es: " + producto.getNombre() + " Descripción: " + producto.getDescripcion() + "Cantidad: " + producto.getCantidad() + " Precio: " + producto.getPrecio());
        }
    }
}
