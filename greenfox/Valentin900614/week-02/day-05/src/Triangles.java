import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.isDefaultLookAndFeelDecorated;

public class Triangles {
    public static void mainDraw(Graphics graphics){
        drawLines(0, HEIGHT, WIDTH/2, 0, graphics);
        drawLines(WIDTH/2, 0, WIDTH, HEIGHT, graphics);
        drawLines(0, HEIGHT, WIDTH, HEIGHT, graphics);

    }

    public static void drawLines(int startX, int startY, int endX, int endY, Graphics g){
        g.setColor(Color.BLACK);

        if (startX == 0 && startY == HEIGHT && endX == WIDTH/2) {
            for (int i = 0; i <= 16; i++) {
                g.drawLine(startX + i * WIDTH / 16, startY, endX + i * WIDTH / 32, endY + i * HEIGHT / 16);
            }
        }

        else if (startX == WIDTH/2 && startY == 0) {
            for (int i = 0; i < 16; i++) {
                g.drawLine(WIDTH/2-i*WIDTH/32, i*HEIGHT/16, WIDTH-i*WIDTH/16, HEIGHT);
            }
        }

        else if (startY == HEIGHT && endX == WIDTH) {
            for (int i = 0; i < 16; i++) {
                g.drawLine(i*WIDTH/32, HEIGHT-i*HEIGHT/16, WIDTH-i*WIDTH/32, HEIGHT-i*HEIGHT/16);
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