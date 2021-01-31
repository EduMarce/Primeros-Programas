/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresII;

/**
 *
 * @author eduardo
 */
public class OperadoresII {
    public static void main(String[] args) {
        
        // Ej 1. Variables
        boolean d = false;  // Variable d inicializada en false
        int x =20, y=100;
        
        d = x<y;
        System.out.println("El resultado de d es: "+ d);
        
        // Ej 2. Variables
        boolean b = 5+2<10*4;
        System.out.println("El resultado de b es: " + b);
        
        // Ej 3. Variables
        boolean a = 10*5<4*2/2+1;
        System.out.println("El resultado de a es: " + a);
        
        // Ej 4. Variables
        boolean s = 3*2+1<4*(10/2);
        System.out.println("El resultado de s es: " + s);
    }
}
