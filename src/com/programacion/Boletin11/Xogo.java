/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin11;

import javax.swing.JOptionPane;


public class Xogo {
    
    private static Xogo instance = null;

    public Xogo() {
    }
    public static Xogo getInstance()
    {
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Xogo();
        }
        // devuelvo la instancia
        return instance;
    }
    public Xogo iniciar(){
        int intentos, num1, num2;
        String continuar;
        boolean seguir = true; 
        while(seguir)
        {
            num1=Integer.parseInt(JOptionPane.showInputDialog(" Hola, jugador 1!!\n Inserta el número que quieras que adivine el jugador 2: "));
        
            if(num1<1 || num1>50)
                System.out.println(" EROR: El numero que has introducido es menor que 1 o superior a 50");
            else
            {
                intentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor de los intentos que tendrá el jugador 2: "));

                do
                {
                    num2=Integer.parseInt(JOptionPane.showInputDialog("Hola jugador 2!\n Introduce un número porfavor: "));
                    intentos--;
                    if(num1>num2)
                    {
                        System.out.println(" Tu numero es menor, te quedan "+intentos+" intentos ");
                    }
                    else if(num1<num2)
                    {
                        System.out.println(" Tu numero es mayor, te quedan "+intentos+" intentos ");
                    }
                    else if (num1==num2)
                    {
                        System.out.println("Ganaste!!!");
                        break;
                    }
                }
                while(intentos > 0);
                if (intentos <= 0)
                {
                    System.out.println("Has perdido u.u");
                }
            }
            continuar = JOptionPane.showInputDialog("Quieres continuar?(si/no)");
            if(continuar.equals("no"))
            {
                seguir=false;
            }
            else if(!continuar.equals("no") && !continuar.equals("si"))
            {
                System.out.println("Error, el valor introducido no es valido");
                break;
            }
        }
        return null;
    }

}
