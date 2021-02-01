/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Sentencia_Switch_case {
    public static void main(String[]args){
      
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);
        int n;
        String dia;
        do{
        System.out.print("Ingrese un día de la semana(1 - 7): ");
        n = sc.nextInt();
        }while(n<=0 || n>7);
        
        switch(n){
            case 1: dia = "Lunes"; break;
            
            case 2: dia = "Martes"; break;
            
            case 3: dia = "Miercoles"; break;
            
            case 4: dia = "Jueves"; break;
            
            case 5: dia = "Viernes"; break;
            
            case 6: dia = "Sábado"; break;
            
            case 7: dia = "Domingo"; break;
            
           default: 
               dia = "Dia Incorrecto";              
        }
        System.out.println("El día es: " + dia);
        
        
    }
}
