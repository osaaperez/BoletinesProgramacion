/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin9;

import javax.swing.JOptionPane;


public class SoldoTra {
  
    private float soldo;

    
    
    

  public void leerSoldo(){
      float porcentaje;
      int soldo1000_1750=0;
      int soldoMenorQue1000=0;
      int numeroTrabajadores=0;
      soldo =0;
      do
      {
        soldo=Float.parseFloat(JOptionPane.showInputDialog("Introduce un sueldo"));
        if(soldo>=1000 && soldo<=1750)
        {
            soldo1000_1750++;
        }
        else if (soldo<1000 && soldo > 0) 
        {
            soldoMenorQue1000++;    
        }
        if ( soldo != 0)
        {
        numeroTrabajadores++;
        }
        
      }
      while(soldo!=0);
      porcentaje=(soldoMenorQue1000*100)/numeroTrabajadores;
      System.out.println("numero de trabajadores que cobra entre 1000 y 1750 es = "+soldo1000_1750);
      System.out.println("numero de trabajadores que cobra entre 1000 y 1750 es = "+numeroTrabajadores);
      System.out.println("Porcentahe de trabajadores que cobran menos de 1000€ es = "+porcentaje+ "%");
      System.out.println("Fin");
    
}
    
}
