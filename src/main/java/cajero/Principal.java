package cajero;

/**
 *
 * @author jorge
 */
public class Principal {
    public static int Dinero = 5000;
    public static void main(String [] args){
        
        Menu mensajeroMenu = new Menu();
        mensajeroMenu.principio();
        mensajeroMenu.solicitar();
    }
}
