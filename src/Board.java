import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;

public class Board extends JFrame {

    private final HashMap<HashMap<Integer, Integer>, Square> squares;
    private boolean flag = true;
    private final int DIMENSION = 8;
    private MouseMotionListener mouseMotionListener;
    public Board() {
        squares = new HashMap<>();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(new GridLayout(DIMENSION, DIMENSION));
        for (int i=0; i < DIMENSION; i++) {
            for (int j=0; j < DIMENSION; j++) {
                Square square;
                if (flag) {
                    square = new Square(Color.WHITE, i);
                } else {
                    square = new Square(Color.GRAY, i);
                }
                this.add(square);
                HashMap<Integer, Integer> coordinate = new HashMap<>();
                coordinate.put(i, j);
                squares.put(coordinate, square);
                flipFlag();
            }
            flipFlag();
        }
        setupStartPosition();

        this.addMouseMotionListener(mouseMotionListener);


        //this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setupStartPosition() {
        int firstRank = 0;
        int secondRank = 1;
        int seventhRank = 6;
        int lastRank = 7;
        // Black Pieces
        squares.get(Map.of(firstRank, 0)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.ROOK, Colour.BLACK)));
        squares.get(Map.of(firstRank, 1)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.KNIGHT, Colour.BLACK)));
        squares.get(Map.of(firstRank, 2)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.BISHOP, Colour.BLACK)));
        squares.get(Map.of(firstRank, 3)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.QUEEN, Colour.BLACK)));
        squares.get(Map.of(firstRank, 4)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.KING, Colour.BLACK)));
        squares.get(Map.of(firstRank, 5)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.BISHOP, Colour.BLACK)));
        squares.get(Map.of(firstRank, 6)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.KNIGHT, Colour.BLACK)));
        squares.get(Map.of(firstRank, 7)).setPiece(new Pawn(Colour.BLACK, Pieces.getUrl(Pieces.ROOK, Colour.BLACK)));
        // Black pawns
        for (int i=0; i < DIMENSION; i++) {
            squares.get(Map.of(secondRank, i)).setPiece(new Pawn(Colour.BLACK,
                    Pieces.getUrl(Pieces.PAWN, Colour.BLACK)));
        }
        // White Pawns

        for (int i=0; i < DIMENSION; i++) {
            squares.get(Map.of(seventhRank, i)).setPiece(new Pawn(Colour.WHITE,
                    Pieces.getUrl(Pieces.PAWN, Colour.WHITE)));
        }
        // White Pieces
        squares.get(Map.of(lastRank, 0)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.ROOK, Colour.WHITE)));
        squares.get(Map.of(lastRank, 1)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.KNIGHT, Colour.WHITE)));
        squares.get(Map.of(lastRank, 2)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.BISHOP, Colour.WHITE)));
        squares.get(Map.of(lastRank, 3)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.QUEEN, Colour.WHITE)));
        squares.get(Map.of(lastRank, 4)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.KING, Colour.WHITE)));
        squares.get(Map.of(lastRank, 5)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.BISHOP, Colour.WHITE)));
        squares.get(Map.of(lastRank, 6)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.KNIGHT, Colour.WHITE)));
        squares.get(Map.of(lastRank, 7)).setPiece(new Pawn(Colour.WHITE, Pieces.getUrl(Pieces.ROOK, Colour.WHITE)));
    }
    private void flipFlag() {
        this.flag = !this.flag;
    }
}
