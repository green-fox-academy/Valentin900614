import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        Color red = new Color(255,0,0);
        Color orange = new Color(255,100,0);
        Color yellow = new Color(255,255,0);
        Color green = new Color(0,255,0);
        Color blue = new Color(0,0,255);
        Color indigo = new Color(75, 0, 130);
        Color violet = new Color(238,130,238);

        Color[] colors = {red, orange, yellow, green, blue, indigo, violet};

        draw(200, colors, graphics);


    }

    public static void draw (int a, Color[] color, Graphics g) {
        int b = 0;
        int c = 0;
        for (int i = 0; i < color.length; i++) {
            g.setColor(color[i]);
            g.fillRect(b, c, a-b, a-c);

            b += a/10;
            c += a/10;
            a -= a/10;
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