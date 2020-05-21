package once_8;

import javax.swing.JFrame;

public class PruebaBoton {
    public static void main( String args[] ){
        MarcoBoton marcoBoton = new MarcoBoton(); 
        marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBoton.setSize( 700, 510 ); 
        marcoBoton.setVisible( true );
    }
    
}