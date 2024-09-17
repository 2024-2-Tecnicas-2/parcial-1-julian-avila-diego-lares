/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.parcial1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class PrincipalTest {
    
    public PrincipalTest() {
    }

     ArrayList<Producto> inventario = new ArrayList<>();

   
    @Test
    public void testAgregarDispositivo() {
        ArrayList<Producto> inventario = new ArrayList<>();
        Producto pro = new Accesorio("Diego", "Nose", 25, 2);
        inventario.add(pro);
        Producto pre = new Accesorio("", "", 0, 0);
        inventario.add(pre);
        if (inventario.add(pro)==inventario.add(pre)) {
            System.out.println("Los objetos presentados son nulos, no contiene informacion");
        }else{
            System.out.println("Los objetos presentados son correctos");
        }
  
                
        
    }

 
    
    @Test
    public void testMostrarDispositivo() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario esta vacio, no contiene informacion");
        }else{
                System.out.println("El inventario contiene informacion");
            
        }
        
    }
    
}
