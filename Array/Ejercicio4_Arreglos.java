/*
    Ingresar 5 palabras por teclado, que tengan no más de 10 caracteres. Y almacenar
    en un arreglo. Al final, mostrarlas en mayusculas
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio4_Arreglos {

    public static void main(String[] args) {

        //Objeto Scanner 
        Scanner sc = new Scanner(System.in);
        String palabra = null;
        String arrayPalabras[] = new String[5];

        System.out.println("Ingrese 5 palabras: ");
        int i = 0;
        while (i < 5) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabra = sc.next();
            palabra = palabra.toUpperCase();
            if (palabra.length() <= 10) {
                arrayPalabras[i] = palabra;
                i++;
            } else {
                System.out.println("Ingrese nuevamente la palabra");
            }
        }

        System.out.println(("\tPALABRAS DEL ARREGLO EN MAYÚSCULAS"));
        for (i = 0; i < arrayPalabras.length; i++) {
            System.out.println("Palabra " + (i + 1) + ": " + arrayPalabras[i]);
        }
    }
}
