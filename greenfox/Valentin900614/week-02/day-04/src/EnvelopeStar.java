import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics){

        drawLines(Color.GREEN, 10, graphics);
    }

    public static void drawLines(Color color, int space, Graphics g){
        g.setColor(color);

        for (int i = 0; i < HEIGHT / (space * 2); i++) {
            g.drawLine((0 + i * space), HEIGHT / 2, WIDTH / 2, (HEIGHT / 2)-(space * i));
        }

        for (int i = 0; i < HEIGHT / (space*2); i++) {
            g.drawLine(0 + (i * space), HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) + (space * i));
        }

        for (int i = 0; i < HEIGHT / (space * 2); i++) {
            g.drawLine(WIDTH / 2, (HEIGHT / 2) + (space * i), WIDTH - (space * i),  HEIGHT / 2);
        }

        for (int i = 0; i < HEIGHT / (space * 2); i++) {
            g.drawLine(WIDTH / 2, HEIGHT / 2 - (space * i), WIDTH - (space * i), HEIGHT / 2);
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