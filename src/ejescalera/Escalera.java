/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejescalera;

/**
 *
 * @author Daniel Alexandro Martínez A00513954
 */
public class Escalera {
    //Constructor
    public Escalera() {
        
    }
    
    /**
     * 
     * @param n, el numero de escalera en el que esta actualmente
     * @return 
     */
    public static String bajarEscalera(int n){
        if(n == 0) { // Caso base, cuando llega al escalon 0
            return "Felicidades bajaste la escalera";
        } else { //Dominio, va bajando los escalones se hace recursivo mientras no llegue al final de los escalones
            System.out.println("Vas bajando el escalon: " + n);
            return bajarEscalera(n - 1);
        }
    }
}
