/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresI;

/**
 *
 * @author eduardo
 */
public class Operadores {
    public static void main(String[]args){
         
       // " = " : Asignación
       // " + - / * % ++ " : Operadores Aritméticos
       
       //Variables
       int a = 40, b =20; 
       int suma = a+b;
       int resta = a-b;
       int multiplicacion = a*b;
       float division = a/b;
       
       //Salida de datos
       System.out.println("\tOPERADORES MATEMÁTICOS");
         System.out.println("a: 40, b: 20");
          System.out.println("a + b = " + suma);
           System.out.println("a - b = " + resta );
            System.out.println("a x b = " + multiplicacion);
             System.out.println("a / b = " + division);
           
       //++ -- Operadores de Incremento y Decremento    
       int d = 5;
       int e = d++;
       System.out.println("\n\tOPERADORES DE INCREMENTO");
        System.out.println("d = 5");
         System.out.println("e = d++");
          System.out.println("El valor de d: " + d) ;
           System.out.println("El valor de e: " + e);
       
       //Operadores Aritméticos Combinados
       int A = 20;
       System.out.println("\n\tOPERADORES COMBINADOS");
        System.out.println("A : " + A);
       A+=100; // A = A + 100
         System.out.println("A+=100 : " + A);
       A-=100; // A = A - 100
          System.out.println("A-=100: " + A);
       A*=2; // A =A *2
           System.out.println("A*=2: " + A);
       A/=2; // A= A/2
            System.out.println("A/=2: " + A);
       
       
    }
}
