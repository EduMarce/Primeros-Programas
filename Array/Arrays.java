/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Arrays {
    public static void main(String[]args){
       //Objeto Scanner
       Scanner sc = new Scanner(System.in);
       
       //Variables
     
       
       //Arreglo de Nombres
       String nombres[] = new String[8];
       System.out.println("Ingrese "+ 8 + " nombres");
       
       for(int i=0;i<8;i++){
        System.out.print("Nombre "+ (i+1) + ": ");
        nombres[i] = sc.nextLine();
       }
       
       
       System.out.println("Los nombres capturados son:");
       for(int i=0;i<8;i++){
        System.out.print(nombres[i] + " ");
       }
    }
}
