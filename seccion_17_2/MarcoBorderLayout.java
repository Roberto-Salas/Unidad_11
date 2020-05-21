package seccion_17_2;

// Demostración de BorderLayout.
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoBorderLayout extends JFrame implements ActionListener
{
    private JButton botones[]; // arreglo de botones para ocultar porciones
    private final String nombres[] = { "Ocultar Norte", "Ocultar Sur", "Ocultar Este", "Ocultar Oeste", "Ocultar Centro" }; 
    private BorderLayout esquema; // objeto BorderLayout
    // establece la GUI y el manejo de eventos
    public MarcoBorderLayout()
    {
        super( "Demostracion de BorderLayout" );
        
        esquema = new BorderLayout( 5, 5 ); // espacios de 5 píxeles 
        setLayout( esquema ); // establece el esquema del marco
        botones = new JButton[ nombres.length ]; // establece el tamaño del arreglo
        
        // crea objetos JButton y registra componentes de escucha para ellos
        for ( int cuenta = 0; cuenta < nombres.length; cuenta++ )
        {
            botones[ cuenta ] = new JButton( nombres[ cuenta ] );
            botones[ cuenta ].addActionListener( this );
        } // ﬁn de for
        add( botones[ 0 ], BorderLayout.NORTH ); // agrega botón al norte
        add( botones[ 1 ], BorderLayout.SOUTH ); // agrega botón al sur
        add( botones[ 2 ], BorderLayout.EAST ); // agrega botón al este
        add( botones[ 3 ], BorderLayout.WEST ); // agrega botón al oeste
        add( botones[ 4 ], BorderLayout.CENTER ); // agrega botón al centro
    } // ﬁn del constructor de MarcoBorderLayout
    
    // maneja los eventos de botón 40  public void actionPerformed( ActionEvent evento )
    {
        // comprueba el origen del evento y distribuye el panel de contenido de manera acorde
        for ( JButton boton : botones )
        {
            if ( evento.getSource() == boton )
            boton.setVisible( false ); // oculta el botón oprimido
            else 
            boton.setVisible( true ); // muestra los demás botones
        } // ﬁn de for
        esquema.layoutContainer( getContentPane() ); // distribuye el panel de contenido
    } // ﬁn del método actionPerformed
} // ﬁn de la clase MarcoBorderLayout