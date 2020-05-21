package unidad11gui;
// Fig. 11.37: DemoTeclas.java
 // Prueba de MarcoDemoTeclas.
import javax.swing.JFrame; 

 public class PruebaDemoTeclas 
 {
  public static void main( String args[] ) 
  {
      MarcoDemoTeclas marcoDemoTeclas = new MarcoDemoTeclas(); 
      marcoDemoTeclas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      marcoDemoTeclas.setSize( 350, 100 ); 
     marcoDemoTeclas.setVisible( true );  
  }
 }