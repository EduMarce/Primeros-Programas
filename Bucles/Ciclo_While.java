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
public class Ciclo_While {
    public static void main(String[]args){
     //Objeto Scanner
     Scanner sc = new Scanner(System.in);
        int n, i=1;
        System.out.print("Ingesa un número entero: ");
        n = sc.nextInt();
       System.out.println("Los números mostrados son: "); 
       while(i<=n){
           System.out.println(i);
           i++;
       }
       System.out.println("\tPROGRAMA FINALIZADO");
    }
}
