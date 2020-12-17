/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin9;

import javax.swing.JOptionPane;


public class TablaMult {
    
    
        
     private int num1;

   
    
    
 
    public void tablaMult(){
        
        int num1=Integer.parseInt(JOptionPane.showInputDialog("introducir valor de num: "));
        while(num1!=0){
            
        for(int i=0;i<=10;i++){
            
            System.out.println(num1+"*"+i+"="+num1*i);
           
        }
        num1=Integer.parseInt(JOptionPane.showInputDialog("introducir valor de num2: "));
        }
        System.out.println("FIN");
       
    }
   
}

    
    
    
    
    

