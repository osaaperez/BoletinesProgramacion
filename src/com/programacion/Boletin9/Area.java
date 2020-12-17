/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin9;

import javax.swing.JOptionPane;


public class Area {
    
    int base, altura, area;
    private static Area instance = null;

    public Area() {
    }

    public static Area getInstance() {
        // compruebo si ya está creada
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Area();
        }
        // devuelvo la instancia
        return instance;
    }

    public Area(int base, int altura, int area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    

    public Area calcularArea(){

        
        do{
            base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
        
        }
        while(getBase() <= 0);
        do{
            altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            
        }while(getAltura() <= 0);
        area = base*altura;
        System.out.println("El área del restángulo es = "+area);

        return null;
    }

}
    

