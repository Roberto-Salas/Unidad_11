package seccion_17_3;

// Prueba de MarcoGridLayout.
import javax.swing.JFrame;

public class DemoGridLayout {
    public static void main( String args[] )
    {
        MarcoGridLayout marcoGridLayout = new MarcoGridLayout();
        marcoGridLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoGridLayout.setSize( 300, 200 ); // establece el tamaño del marco
        marcoGridLayout.setVisible( true ); // muestra el marco
    } // ﬁn de main 
}