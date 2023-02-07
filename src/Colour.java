import java.awt.*;

public enum Colour {
    WHITE,
    BLACK;

    public static Color getColor(Colour colour) {
        if (colour == WHITE) {
            return Color.WHITE;
        } else return Color.GRAY;
    }
}




