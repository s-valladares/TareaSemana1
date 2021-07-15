/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author Luisa
 */
public class ImplementsOperaciones implements IOperaciones{
    
    @Override
    public double convertirADolares(double cantidad) {
        double precioDolar = 7.75;
        return cantidad * precioDolar;
    }

    @Override
    public double convertirAEuros(double cantidad) {
        double precioEuro = 9.15;
        return cantidad * precioEuro;
    }

    @Override
    public double convertirAYuanes(double cantidad) {
        
        double precioYuan = 1.20;
        return cantidad * precioYuan;
    }
    
}
