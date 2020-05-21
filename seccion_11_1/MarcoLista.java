package seccion_11_1;

 // Selección de colores de un objeto JList.
 import java.awt.FlowLayout;
 import java.awt.Color;
 import javax.swing.JFrame;
 import javax.swing.JList;
 import javax.swing.JScrollPane;
 import javax.swing.event.ListSelectionListener;
 import javax.swing.event.ListSelectionEvent;
 import javax.swing.ListSelectionModel;

 public class MarcoLista extends JFrame
 {
     private final JList listaJListColores; // lista para mostrar colores
     private ﬁnal String nombresColores[] = { "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };
     private ﬁnal Color colores[] = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };

     // El constructor de MarcoLista agrega a JFrame el JScrollPane que contiene a JList
     public MarcoLista()
     {
         super( "Prueba de JList" );
         setLayout( new FlowLayout() ); // establece el esquema del marco
         
         listaJListColores = new JList( nombresColores ); // crea con nombresColores
         listaJListColores.setVisibleRowCount( 5 ); // muestra cinco ﬁlas a la vez

         // no permite selecciones múltiples
         listaJListColores.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

         // agrega al marco un objeto JScrollPane que contiene a JList
         add( new JScrollPane( listaJListColores ) );
         
         listaJListColores.addListSelectionListener( new ListSelectionListener() // clase interna anónima
         {
             // maneja los eventos de selección de la lista
             public void valueChanged( final ListSelectionEvent evento )
             {
                getContentPane().setBackground(colores[ listaJListColores.getSelectedIndex() ] );
            } // ﬁn del método valueChanged
        } // ﬁn de la clase interna anónima
        ); // ﬁn de la llamada a addListSelectionListener
    } // ﬁn del constructor de MarcoLista
} // ﬁn de la clase MarcoLista 