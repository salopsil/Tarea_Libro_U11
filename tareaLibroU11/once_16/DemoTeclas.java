package once_16;

import javax.swing.JFrame;

public class DemoTeclas {
    public static void main( String args[] ){
        MarcoDemoTeclas marcoDemoTeclas = new MarcoDemoTeclas();
        marcoDemoTeclas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoDemoTeclas.setSize( 350, 100 ); // establece el tamaño del marco
        marcoDemoTeclas.setVisible( true );
    }
    
}