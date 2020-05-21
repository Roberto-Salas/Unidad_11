package seccion_18_1;

// Prueba de MarcoPanel.
import javax.swing.JFrame;

public class DemoPanel {
    public static void main( String args[] )
    {
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
        marcoPanel.setVisible( true ); // muestra el marco
    } // ﬁn de main 
    
}