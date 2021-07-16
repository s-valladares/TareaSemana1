/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import operaciones.ImplementsOperaciones;

/**
 *
 * @author Luisa
 */
public class ClsPrincipal {
    private String nombrePersona;
    private double cantidad;
    private double resultado;
    Scanner sc = new Scanner(System.in);
    ImplementsOperaciones operaciones = new ImplementsOperaciones();
    
    public void iniciar(){
        System.out.println("Ingrese  su nombre: ");
        nombrePersona = sc.nextLine();
        System.out.println("Ingrese una cantidad de dinero: ");
        cantidad = sc.nextDouble();
     
        menu();
        
    }
    
    
    public void menu(){
        
        int opcion;

            
           System.out.println("1. Dólares.");
           System.out.println("2. Euros.");
           System.out.println("3. Yuanes.");
           System.out.println("4. Deseo salir.");
            
           System.out.println("¿A qué desea convertirlo?");
           opcion = sc.nextInt();
           
           switch(opcion){
               case 1:
                   resultado = operaciones.convertirADolares(cantidad);
                   System.out.println("El resultado es: " + resultado);
                   break;
               case 2:
                    resultado = operaciones.convertirAEuros(cantidad);
                   System.out.println("El resultado es: " + resultado);
                   break;
                case 3:
                    resultado = operaciones.convertirAYuanes(cantidad);
                   System.out.println("El resultado es: " + resultado);
                   break;
                case 4:
                   break;
                default:
                   System.out.println("Esa opción no existe");
           
            
       }
    }
}
