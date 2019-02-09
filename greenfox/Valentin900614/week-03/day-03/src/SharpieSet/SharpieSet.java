package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> list;

    public SharpieSet () {
        list = new ArrayList<Sharpie>();
    }

    public boolean countUsable (Sharpie sharpie) {
        if (sharpie.inkAmount > 0) {
            return true;
        }
        return false;
    }

    // lehet a következő methodnak az előzőre kellene épülnie
    public void removeTrash (List<Sharpie> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).inkAmount <= 0)
                list.remove(i);
        }
    }
}
