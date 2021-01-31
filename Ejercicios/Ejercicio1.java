/*
    Si una camisa vale 1000 pesos, obtener el total a pagar, si se
    le aplica el 50%, y se le agrega el 20% de los impuestos
*/
package Ejercicios;

/**
 *
 * @author eduardo
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Variables
        final int valorCamisa = 1000;
        float descuento = (50*valorCamisa)/100;
        float impuesto = (20*valorCamisa)/100;
        float Total = valorCamisa + impuesto - descuento;
        
        System.out.println("El valor total de la compra: " + Total );
        
    }
}
