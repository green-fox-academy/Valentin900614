package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    int slots;
    List<Animal> list;

    public Farm () {
        slots = 50;
        list = new ArrayList<>();
    }

    public void breed () {
        if (slots > 0) {
            Animal animal = new Animal();
            list.add(animal);
        }
    }

    public void slaughter (List<Animal> list) {
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(index).hunger < list.get(i).hunger)
                index = i;
        }
        list.remove(list.get(index));
    }

}
