
import javax.swing.JOptionPane;

public class Suma {
    public static void main( String args[] ){
        String numeroUno =JOptionPane.showInputDialog( "Introduzca el primer numero entero" );
        String numeroDos =JOptionPane.showInputDialog( "Introduzca el segundo numero entero" );

        int numero1 = Integer.parseInt( numeroUno );
        int numero2 = Integer.parseInt( numeroDos );
        int suma = numero1 + numero2; 

        JOptionPane.showMessageDialog( null, "La suma es " + suma,"Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
    }
}