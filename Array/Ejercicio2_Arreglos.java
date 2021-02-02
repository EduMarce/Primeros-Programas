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
public class Ejercicio2_Arreglos {
    public static void main(String[]args){
    
       //Objeto Scanner
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el tamaño del arreglo: ");
       int tamaño = sc.nextInt();
       int arrayDoble[] = new int[tamaño];
       int array[] = new int[tamaño];
       int i=0;
       while(i<tamaño){
         System.out.println("Número " + (i+1) + ": ");
         array[i] = sc.nextInt();
         i++; // Se incrementa el i
       }
       
       System.out.println("\tARREGLO MÚLTIPLICADO POR 2");
       int j=0;
       while(j<tamaño){
          arrayDoble[j] = array[j]*2;
          System.out.println(array[j] + "\t" + arrayDoble[j]);
          j++;
       }
        
    }
}
