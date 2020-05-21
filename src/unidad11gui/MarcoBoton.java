package unidad11gui;
// Fig. 11.15: MarcoBoton.java
 // Creación de objetos JButton.
 import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JButton;
 import javax.swing.Icon;
 import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

 public class MarcoBoton extends JFrame
 {
 private JButton botonJButtonSimple; // botón con texto solamente
 private JButton botonJButtonElegante; // botón con iconos

 // MarcoBoton agrega objetos JButton a JFrame
 public MarcoBoton()
 {
 super( "Prueba de botones" );
 setLayout( new FlowLayout() ); // establece el esquema del marco
 //tamaño de la ventana
 setLocationRelativeTo(null);//posiciona la ventana en el centro
 botonJButtonSimple = new JButton( "Boton Simple" ); // botón con texto
 add( botonJButtonSimple ); // agrega botonJButtonSimple a JFrame

 Icon bobesponja1 = new ImageIcon( getClass().getResource( "la pizza de don cangrejo.gif" ) );
 Icon bobesponja2 = new ImageIcon( getClass().getResource( "episodioperdido.gif" ) );
 botonJButtonElegante = new JButton( "Boton elegante", bobesponja1 ); // establece la imagen
 botonJButtonElegante.setRolloverIcon( bobesponja2 ); // establece la imagen de sustitución
 botonJButtonElegante.setSize(500,500);
 add( botonJButtonElegante ); // agrega botonJButtonElegante a JFrame

 // crea nuevo ManejadorBoton para manejar los eventos de botón
 ManejadorBoton manejador = new ManejadorBoton();
 botonJButtonElegante.addActionListener( manejador );
 botonJButtonSimple.addActionListener( manejador );
 } // fin del constructor de MarcoBoton

 // clase interna para manejar eventos de botón
 private class ManejadorBoton implements ActionListener
 {
 // maneja evento de botón
 public void actionPerformed( ActionEvent evento )
 {
 JOptionPane.showMessageDialog( MarcoBoton.this, String.format(
 "Usted oprimio: %s", evento.getActionCommand() ) );
 } // fin del método actionPerformed
 } // fin de la clase interna privada ManejadorBoton
 } // fin de la clase MarcoBoton