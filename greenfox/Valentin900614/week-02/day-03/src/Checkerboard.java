import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int a = WIDTH/8;
        int b = HEIGHT/8;
        int c = 1;

        for (int i = 0; i < WIDTH; i+=a) {
            for (int j = 0; j < HEIGHT; j+=b) {
                if (c%2==0){
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(j, i, a, b);
                    c++;
                }
                else {
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(j, i, a, b);
                    c++;
                }
            } c++;
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