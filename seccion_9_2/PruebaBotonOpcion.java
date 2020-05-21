package seccion_9_2;

 // Prueba de MarcoBotonOpcion.
 import javax.swing.JFrame; 

public class PruebaBotonOpcion {
    
    public static void main( String args[] ) 
    {
        MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
        marcoBotonOpcion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBotonOpcion.setSize( 350, 100 ); // establece el tamaño del marco
        marcoBotonOpcion.setVisible( true ); // muestra el marco
    } // ﬁn de main 
}