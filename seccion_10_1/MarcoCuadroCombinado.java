package seccion_10_1;

 // Uso de un objeto JComboBox para seleccionar una imagen a mostrar.
 import java.awt.FlowLayout;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JComboBox;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
 
 public class MarcoCuadroCombinado extends JFrame
 {
     private JComboBox imagenesJComboBox; // cuadro combinado con los nombres de los    iconos
     private JLabel etiqueta; // etiqueta para mostrar el icono seleccionado
     
     private String nombres[] = 
     { "uno.jpg", "dos.jpg", "tres.png", "cuatro.png" };
     private Icon iconos[] = {
         new ImageIcon( getClass().getResource( nombres[ 0 ] ) ),
         new ImageIcon( getClass().getResource( nombres[ 1 ] ) ),
         new ImageIcon( getClass().getResource( nombres[ 2 ] ) ),
         new ImageIcon( getClass().getResource( nombres[ 3 ] ) ) };

         // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
         public MarcoCuadroCombinado()
         {
             super( "Prueba de JComboBox" ); 
             setLayout( new FlowLayout() ); // establece el esquema del marco

             imagenesJComboBox = new JComboBox( nombres ); // establece JComboBox}
             imagenesJComboBox.setMaximumRowCount( 3 ); // muestra tres ﬁlas

             imagenesJComboBox.addItemListener( new ItemListener() // clase interna anónima
             {
                // maneja evento de JComboBox
                public void itemStateChanged( ItemEvent evento )
                {
                    // determina si está seleccionada la casilla de veriﬁcación
                    if ( evento.getStateChange() == ItemEvent.SELECTED )
                    etiqueta.setIcon( iconos[ imagenesJComboBox.getSelectedIndex() ] );
                } // ﬁn del método itemStateChanged
            } // ﬁn de la clase interna anónima 
            ); // ﬁn de la llamada a addItemListener

            add( imagenesJComboBox ); // agrega cuadro combinado a JFrame
            etiqueta = new JLabel( iconos[ 0 ] ); // muestra el primer icono
            add( etiqueta ); // agrega etiqueta a JFrame
        } // ﬁn del constructor de MarcoCuadroCombinado
    } // ﬁn de la clase MarcoCuadroCombinado
 