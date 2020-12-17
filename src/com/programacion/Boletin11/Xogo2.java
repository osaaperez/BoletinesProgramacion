/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion.Boletin11;

import javax.swing.JOptionPane;


public class Xogo2 {

    private static Xogo2 instance = null;

    public Xogo2() {
    }

    public static Xogo2 getInstance() {
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Xogo2();
        }
        // devuelvo la instancia
        return instance;
    }

    public Xogo2 iniciar() {
        int intentos, num1, num2,num3,num4,num5,num6,num7,num8;
        String continuar;
        boolean seguir = true;
        while (seguir) {

            intentos = Integer.parseInt(JOptionPane.showInputDialog("Hola jugador introduce el numero de  intentos que tendrás para ganar: "));
            num1 = (int) Math.floor(Math.random() * (1 - 50 + 1) + 50);

            do {
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Hola jugador!\n Introduce un número porfavor: "));
                if(num2>1 && num2<50)
                {
                intentos--;
                
                //numero a adivinar 25
                num3 = num1+20;//numero original+20   45
                num4 = num1+10;//original+10   35
                num5=num1+5;//  30
                num6 = num1-20;//numero original+20  5
                num7 = num1-10;//original+10   15
                num8=num1-5;//   20
                
                //50>45         º1<5
                if(num2>num3 || num2<num6)
                {
                    System.out.println("Moi lonxe\nte quedan "+ intentos+ " intentos");
                }
                //       36<=45          36>=35       14<=15        14 >= 5
                else if ((num2<=num3 && num2>=num4)||(num2<=num7 && num2>=num6))
                {
                    System.out.println("Lonxe\nte quedan "+ intentos+ " intentos");
                }
                //       34<35         34>30         19>15        19<20           
                else if((num2<num4 && num2>num5) || (num2>num7 && num2<num8))
                {
                    System.out.println("Preto\nte quedan "+ intentos+ " intentos");
                    
                }//     ((30<=30 && 30>25)||(24>=20 && 24<25))
                else if ((num2<=num5 && num2>num1)|| (num2>=num8 && num2<num1))
                {
                    System.out.println("Moi preto\nte quedan "+ intentos+ " intentos");
                }
                else if (num1 == num2)
                {
                    System.out.println("Ganaste!!!");
                    break;
                }
                }
                else
                {
                    System.out.println("Ese numero es menor que 1 o mayor que 50 vuelve a intentarlo"); 
                    
                } 
            } while (intentos > 0);
            if (intentos <= 0) {
                System.out.println("Has perdido u.u");
            }

            continuar = JOptionPane.showInputDialog("Quieres continuar?(si/no)");
            if (continuar.equals("no")) {
                seguir = false;
            } else if (!continuar.equals("no") && !continuar.equals("si")) {
                System.out.println("Error, el valor introducido no es valido");
                break;
            }
        }
        return null;
    }

}
