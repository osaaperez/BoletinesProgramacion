/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin9;

import javax.swing.JOptionPane;


public class NumeroCalc {
    
   float num;
   int positivos=0 , negativos=0 , ceros=0;
   
   public void numeros(){
       for(int i=0;i<10;i++){
       num=Float.parseFloat(JOptionPane.showInputDialog("teclea num"+(i+1)));
       if(num>0){
           positivos++;
       }else if(num<0){
           negativos++;
       }
       else if(num==0){
           ceros++;
       }
       
       }
   }
      public void visualizar(){
          System.out.println("Numeros positivos = "+positivos+"\nNumeros negativos = "+negativos+"\nNumero de ceros = "+ceros);
      }
    
    
}
