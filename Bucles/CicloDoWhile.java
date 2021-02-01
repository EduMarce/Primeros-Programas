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
public class CicloDoWhile {
    public static void main(String[]args){
        //Objeto Scanner   
        Scanner sc = new Scanner(System.in);
        int n, i=0;
        
        do{
          System.out.println("Ingrese un número entre 1 y 10: ");
          n = sc.nextInt();
          if(n<=0 || n>10){
              System.out.println("VALOR INCORRECTO, INGRESA NUEVAMENTE");
              i++;
          }
        }while(n<=0 || n>10);
     
        if(i==0){
        System.out.println("NO TE EQUIVOCASTE EN INGRESAR");
        }
        else{
            if(i==1){
             System.out.println("TE EQUIVOCASTE EN INGRESAR " + i + " vez.");   
            }
            else{
             System.out.println("TE EQUIVOCASTE EN INGRESAR " + i + " veces.");
            }
            
        }
        
    }
}
