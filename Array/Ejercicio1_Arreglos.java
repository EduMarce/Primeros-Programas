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
public class Ejercicio1_Arreglos {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int tamaño;
      System.out.print("Ingrese el número de posiciones: ");
      tamaño = sc.nextInt();
      int array[] = new int[tamaño];
      int suma=0;
      
      System.out.println("Ingrese los números enteros: ");
      for(int i=0;i<tamaño;i++){
       System.out.print("Número "+ (i+1)+ ": ");
       array[i] = sc.nextInt();
       suma+= array[i];
      }
      
      System.out.print("La suma es: " + suma);
        
    }
}
