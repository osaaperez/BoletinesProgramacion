/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin8;

import javax.swing.JOptionPane;


public class Ejercicio7 {


    public static void main(String[] args) {
        // TODO code application logic here
        Ejer7 ej7=new Ejer7();
        String resposta;
        do{
        resposta=JOptionPane.showInputDialog("Menu \nArea Triangulo \nArea Cadrado \nArea Circulo ").toUpperCase();
        
        switch (resposta){
            
            case"AREA TRIANGULO": ej7.calcularTriangulo();
            break;
            case"AREA CUADRADO":ej7.calcularCuadrado();
            break;
            case"AREA CIRCULO":ej7.calcularCirculo();
            break;
            default:System.out.println("FIN");
         
        }
        }while(!resposta.equals("FIN"));
    }
    
}
