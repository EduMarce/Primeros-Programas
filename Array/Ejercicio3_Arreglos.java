/*
    Programa Java que lea por teclado 10 números enteros y los guarde en un  array
    y calcula y muestre por separado el promedio de los números positivos y la de los 
    números negativos
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio3_Arreglos {

    public static void main(String[] args) {
        //Objeto Scanner
        int pos = 0, suma_pos = 0;
        int neg = 0, suma_neg = 0;
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];
        System.out.println("Ingresar los 10 números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > 0) {
                suma_pos += numeros[i];
                pos++;
            } else {
                suma_neg += numeros[i];
                neg++;
            }
        }
        double promedioPOS = suma_pos / pos;
        double promedioNEG = suma_neg / neg;

        System.out.println("\tRESULTADOS");
        System.out.print("\nEl promcedio de los números positivos: " + promedioPOS);
        System.out.print("\nEl promcedio de los números negativos: " + promedioNEG);

    }
}
