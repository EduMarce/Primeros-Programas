
package Paquete1;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Principal {
    public static void main(String[] args) {
        //Clase Scanner
        Scanner sc = new Scanner(System.in);
        
        // Variables
        byte edad;
        String nombre;
        
        //Ingreso de Datos
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = sc.nextByte();
        
        //Salida de datos
        System.out.println("Hola! mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}
