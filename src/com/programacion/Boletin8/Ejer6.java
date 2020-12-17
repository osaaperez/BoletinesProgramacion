/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin8;

import javax.swing.JOptionPane;


public class Ejer6 {
    
    public void vendasAnuaisAlm(){
        
        int vendasAnuais = Integer.parseInt(JOptionPane.showInputDialog("Indica el numero de vendas anuais"));
        if (vendasAnuais>0){
            if(vendasAnuais<= 1000){
                System.out.println("artigo de consumo baixo");
            }
            if(vendasAnuais<= 1000){
                System.out.println("artigo de consumo baixo");
            }
            if(vendasAnuais>100 && vendasAnuais<=500){
                System.out.println("artigo de consumo medio");
            }
            if(vendasAnuais>500 && vendasAnuais<=1000){
                System.out.println("artigo de consumo alto");
            }
            if(vendasAnuais>1000){
                System.out.println("artigo de consumo de primeira necesidade");
            }  
        }
        else{
            System.out.println("El valor de las vendas anuais tienen que se maior a 0");
        }
    
}
    
    
}
