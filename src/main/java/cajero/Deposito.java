
package cajero;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Deposito extends Principal {
    Scanner entrada = new Scanner(System.in);
    public int depositar = 0;
    public void deposito(){
        System.out.println("-----------------------------------");
        System.out.println("Ingrese el dínero a depositar: " );
        depositar = entrada.nextInt();
        System.out.println("-----------------------------------");
        
        Dinero += depositar; 
        
        System.out.println("-----------------------------------");
        System.out.println("Usted depositó : " + depositar );
        System.out.println("Usted tiene: " + Dinero);
        System.out.println("-----------------------------------");
    }
}
