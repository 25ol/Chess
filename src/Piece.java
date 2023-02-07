import org.apache.batik.swing.JSVGCanvas;
import java.awt.*;

public abstract class Piece extends JSVGCanvas {

   private Colour colour;

   public Piece(Colour colour, String url) {
      this.setURI(url);
   }

   public void setColor(Color color) {
      this.setBackground(color);
   }

   public void move() {}

}
