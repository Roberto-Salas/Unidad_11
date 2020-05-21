package seccion_13_1;

 // Prueba de MarcoRastreadorRaton.
 import javax.swing.JFrame;

public class RastreadorBoton {
    public static void main( String args[] )
    {
        MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
        marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoRastreadorRaton.setSize( 300, 100 ); // establece el tamaño del marco
        marcoRastreadorRaton.setVisible( true ); // muestra el marco
    } // ﬁn de main 
    
}