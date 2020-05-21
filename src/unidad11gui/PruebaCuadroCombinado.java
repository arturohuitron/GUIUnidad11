package unidad11gui;
// Fig. 11.22: PruebaCuadroCombinado.java
 // Prueba de MarcoCuadroCombinado.
 import javax.swing.JFrame;

public class PruebaCuadroCombinado
{
    public static void main( String args[] ) 
    {
     MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado(); 
     marcoCuadroCombinado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     marcoCuadroCombinado.setSize( 440, 400 ); 
     marcoCuadroCombinado.setVisible( true ); 
    }
}