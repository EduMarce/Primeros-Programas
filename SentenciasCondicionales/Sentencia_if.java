/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SentenciasCondicionales;

/**
 *
 * @author eduardo
 */
public class Sentencia_if {
    public static void main(String[]args){
       //Variables
       
       int a=20, b=30, c=40;
       
       //Sentencia Condicional:
       if((a>0 && b<0) || c>0){
           System.out.println("if ejecutado");
       } 
       else{
           System.out.println("else ejecutado");
       }
    }
}
