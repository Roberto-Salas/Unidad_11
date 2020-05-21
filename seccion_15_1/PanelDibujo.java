package seccion_15_1;

 // Fig. 11.34: PanelDibujo.java
 // Uso de la clase MouseMotionAdapter.
 import java.awt.Point;
 import java.awt.Graphics;
 import java.awt.event.MouseEvent;
 import java.awt.event.MouseMotionAdapter;
 import javax.swing.JPanel;
 
 public class PanelDibujo extends JPanel
 {
     private int cuentaPuntos = 0; // cuenta el número de puntos
     // arreglo de 10000 referencias a java.awt.Point
     private Point puntos[] = new Point[ 10000 ];
     // establece la GUI y registra el manejador de eventos del ratón
     public PanelDibujo()
     {
        // maneja evento de movimiento del ratón en el marco
        addMouseMotionListener( 
            
        new MouseMotionAdapter() // clase interna anónima
        {
            // almacena las coordenadas de arrastre y vuelve a dibujar
            public void mouseDragged( MouseEvent evento )
            {
                if ( cuentaPuntos < puntos.length )
                {
                    puntos[ cuentaPuntos ] = evento.getPoint(); // busca el punto
                    cuentaPuntos++; // incrementa el número de puntos en el arreglo
                    repaint(); // vuelve a dibujar JFrame
                } // ﬁn de if
            } // ﬁn del método mouseDragged
        } // ﬁn de la clase interna anónima
        ); // ﬁn de la llamada a addMouseMotionListener
    } // ﬁn del constructor de PanelDibujo
    
    // dibuja un óvalo en un cuadro delimitador de 4 x 4, en la ubicación especiﬁcada en la ventana
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // borra el área de dibujo
        
        // dibuja todos los puntos en el arreglo
        for ( int i = 0; i < cuentaPuntos; i++ )
        g.fillOval( puntos[ i ].x, puntos[ i ].y, 4, 4 );
    } // ﬁn del método paint
} // ﬁn de la clase PanelDibujo 