/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperadoresIII;

/**
 *
 * @author eduardo
 */
public class OperadoresIII {
    public static void main(String[]args){
    
        //Ej.1
        int v = 4;
        if(!(v>0) && (v<100)){ // !(true) (true) => false true
            System.out.println("if se ejecuta");
        }
        else{
            System.out.println("else se ejecuta");
        }
        
        if(!(v>0)|| (v<100)){
            System.out.println("if se ejecuta");
        }
        else{
            System.out.println("else se ejecuta");
        }
        
    }
}
