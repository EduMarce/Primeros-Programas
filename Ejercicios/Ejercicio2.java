/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio2 {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int valor;
        System.out.println("Ingrese un valor: ");
        valor = sc.nextInt();
      int resto = valor%2;
      if(resto==0){
          System.out.println(valor + " es par.");
      }
      else{
          System.out.println(valor + " es impar");
      }
    }
}
