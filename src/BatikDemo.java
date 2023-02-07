import org.apache.batik.swing.JSVGCanvas;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BatikDemo extends JFrame {

    public static void main(String[] args) {

        JSVGCanvas svgCanvas = new JSVGCanvas();
        svgCanvas.setURI("/home/joakimfb/Dokument/projects/Chess/Resouerces/Pieces/bB.svg");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.add(svgCanvas);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
