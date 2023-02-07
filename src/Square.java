import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    private final Color color;
    private int sign;
    private String url;

    private Piece piece = null;

    public Square(Color color, int sign) {
        this.setLayout(new BorderLayout());
        this.color = color;
        this.sign = sign;
        this.setBackground(this.color);
        this.setVisible(true);
    }


    public void setPiece(Piece piece) {
        this.piece = piece;
        piece.setColor(color);
        this.add(piece);
    }

    public void removePiece() {
        this.remove(piece);
        piece = null;
    }

    public String test() {
        return "hello";
    }

}
