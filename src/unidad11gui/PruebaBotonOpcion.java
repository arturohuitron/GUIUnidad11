package unidad11gui;
// Fig. 11.20: PruebaBotonOpcion.java
 // Prueba de MarcoBotonOpcion.
 import javax.swing.JFrame;

 public class PruebaBotonOpcion
 {
 public static void main( String args[] )
 {
 MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
 marcoBotonOpcion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 marcoBotonOpcion.setSize( 350, 100 ); // establece el tamaño del marco
 marcoBotonOpcion.setVisible( true ); // muestra el marco
 } // fin de main
 } // fin de la clase PruebaBotonOpcion
