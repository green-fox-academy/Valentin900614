import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){

        drawLines(Color.MAGENTA, 20, true, graphics);
        drawLines(Color.GREEN, 20, false, graphics);

    }

    public static void drawLines(Color color, int space, boolean change, Graphics g){
        g.setColor(color);

        if (change){
            for (int i = 0; i < WIDTH/space; i++) {
                g.drawLine(0 + (i * space), 0, WIDTH, 10 + (i * space));
            }
        }

        else {
            for (int i = 0; i < HEIGHT/space; i++) {
                g.drawLine(0, 0 + (i * space), 10 + (i * space), HEIGHT);
            }
        }
        
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}