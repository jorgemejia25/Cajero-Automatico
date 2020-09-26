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
public class Menu {
    private int numero = 0, x = 1;
    Scanner entrada = new Scanner(System.in);
    public void principio(){
        System.out.println("------------------------------");
        System.out.println("Ingrese 1 para consultar.");
        System.out.println("Ingrese 2 para retirar.");
        System.out.println("Ingrese 3 para depositar.");
        System.out.println("Ingrese 4 para salir.");
        System.out.println("------------------------------");
        numero = entrada.nextInt();
    }
    public void solicitar(){
        if (numero == 1){
            Consulta mensajeroConsulta = new Consulta();
            mensajeroConsulta.Consultar();
            principio();
            solicitar();
            
        }
        if (numero == 2){
            Retiro mensajeroRetiro = new Retiro();
            mensajeroRetiro.retirar();
            principio();
            solicitar();
        }
        if (numero == 3){
            Deposito mensajeroDeposito = new Deposito();
            mensajeroDeposito.deposito();
            principio();
            solicitar();
            
        }        
    
        if (numero == 4){
            Salir mensajeroSalida = new Salir();
            mensajeroSalida.irse();
        }
            
    }
}
