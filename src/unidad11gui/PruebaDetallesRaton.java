package unidad11gui;
// Fig. 11.32: DetallesRaton.java
 // Prueba de MarcoDetallesRaton.
 import javax.swing.JFrame;

 public class PruebaDetallesRaton
 {
 public static void main( String args[] )
 {
 MarcoDetallesRaton marcoDetallesRaton = new MarcoDetallesRaton();
 marcoDetallesRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 marcoDetallesRaton.setSize( 400, 150 ); // establece el tamaño del marco
 marcoDetallesRaton.setVisible( true ); // muestra el marco
 } // fin de main
 } // fin de la clase DetallesRaton