package seccion_19_1;

// Copia el texto seleccionado de un área de texto a otra.
import javax.swing.JFrame; 

public class DemoAreaTecto {
    public static void main( String args[] )
    {
        MarcoAreaTexto marcoAreaTexto = new MarcoAreaTexto();
        marcoAreaTexto.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoAreaTexto.setSize( 425, 200 ); // establece el tamaño del marco
        marcoAreaTexto.setVisible( true ); // muestra el marco
    } // ﬁn de main 
    
}