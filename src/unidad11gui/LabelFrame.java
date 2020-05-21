package unidad11gui; 
// Fig. 11.6: LabelFrame.java
 // Demostración de la clase JLabel.
 import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

        
public class LabelFrame extends JFrame{
    private final JLabel gif;
    
    public LabelFrame(){
        
        super("Puro Nitro");
        setLayout( new FlowLayout());
        
        Icon carrito = new ImageIcon( getClass().getResource("carrito.gif"));

        
        gif = new JLabel();
        gif.setText("Podemos observar que si quema cuh");
        gif.setIcon(carrito);
        gif.setHorizontalTextPosition(SwingConstants.CENTER);
        gif.setVerticalTextPosition(SwingConstants.BOTTOM);
        gif.setToolTipText("c:");
        add( gif );
    }
}
         
         