/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**Escribir un programa que pida dos números enteros por teclado y 
 * calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

 *
 * @author Rodrigo y Ale
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        
        
        
        System.out.println("ingresa el numero ");
        numero1 = entrada.nextInt();
        
         System.out.println("ingresa el numero ");
        numero2 = entrada.nextInt();
        int suma = numero1 + numero2;
        System.out.println("la suma es :" + suma );
        
    }
    
}
