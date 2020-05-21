package seccion_14_1;

// Fig. 11.31: MarcoDetallesRaton.java
// Demostración de los clics del ratón y cómo diferenciar los botones del mismo.
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoDetallesRaton extends JFrame
{
    private String detalles; // objeto String que representa al objeto JLabel
    private JLabel barraEstado; // que aparece en la parte inferior de la ventana
    // constructor establece String de la barra de título y registra componente de escucha del ratón
    public MarcoDetallesRaton()
    {
        super( "Clics y botones del raton"); 
        barraEstado = new JLabel( "Haga clic en el raton" );
        add( barraEstado, BorderLayout.SOUTH );
        addMouseListener( new ManejadorClicRaton() ); // agrega el manejador
    } // ﬁn del constructor de MarcoDetallesRaton
    // clase interna para manejar los eventos del ratón
    private class ManejadorClicRaton extends MouseAdapter
    {
        // maneja evento de clic del ratón y determina cuál botón se oprimió
        public void mouseClicked( MouseEvent evento )
        {
            int xPos = evento.getX(); // obtiene posición x del ratón
            int yPos = evento.getY(); // obtiene posición y del ratón
            
            detalles = String.format( "Se hizo clic %d vez(veces)", evento.getClickCount() ); 
            if ( evento.isMetaDown() ) // botón derecho del ratón 
            detalles += " con el boton derecho del raton";
            else if ( evento.isAltDown() ) // botón central del ratón 
            detalles += " con el boton central del raton";
            else // botón izquierdo del ratón 
            detalles += " con el boton izquierdo del raton";

            barraEstado.setText( detalles ); // muestra mensaje en barraEstado
        } // ﬁn del método mouseClicked
    } // ﬁn de la clase interna privada ManejadorClicRaton
} // ﬁn de la clase MarcoDetallesRaton
