package seccion_5_1;

 import javax.swing.JFrame;
 public class PruebaCampoTexto
{
    public static void main( String args[] )
    {
        CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        campoTextoMarco.setSize( 350, 100 ); // establece el tamaño del marco
        campoTextoMarco.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase PruebaCampoTexto