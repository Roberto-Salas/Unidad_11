package seccion_17_1;

// Prueba de MarcoFlowLayout.
import javax.swing.JFrame;

public class DemoFlowLayout {
    public static void main( String args[] )
    {
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
        marcoFlowLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoFlowLayout.setSize( 350, 75 ); // establece el tamaño del marco
        marcoFlowLayout.setVisible( true ); // muestra el marco
    } // ﬁn de main 
    
}