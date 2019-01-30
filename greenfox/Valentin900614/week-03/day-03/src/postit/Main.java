package postit;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //nem tettem konstruktort

        PostIt first = new PostIt();
        first.backgroundColor = Color.ORANGE;
        first.text = "Idea 1";
        first.textColor = Color.BLUE;

        PostIt second = new PostIt();
        second.backgroundColor = Color.PINK;
        second.text = "Awesome";
        second.textColor = Color.BLACK;

        PostIt third = new PostIt();
        third.backgroundColor = Color.YELLOW;
        third.text = "Superb!";
        third.textColor = Color.GREEN;

    }
}
