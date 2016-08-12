/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejescalera;

import java.util.Scanner;

/**
 *
 * @author Daniel Aelxandro Martínez A00513954
 */
public class EjEscalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero de escalones: ");
        System.out.println(Escalera.bajarEscalera(scan.nextInt()));
    }
    
}
