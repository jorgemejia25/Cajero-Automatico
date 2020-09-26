/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Retiro extends Principal {
    Scanner entrada = new Scanner(System.in);
    public int retiro = 0;
    public void retirar(){
        System.out.println("-----------------------------------");
        System.out.println("Ingrese el dínero a retirar: " );
        retiro = entrada.nextInt();
        System.out.println("-----------------------------------");
        
        Dinero -= retiro; 
        
        System.out.println("-----------------------------------");
        System.out.println("Usted retiró : " + retiro );
        System.out.println("Usted tiene: " + Dinero);
        System.out.println("-----------------------------------");
    }
}
