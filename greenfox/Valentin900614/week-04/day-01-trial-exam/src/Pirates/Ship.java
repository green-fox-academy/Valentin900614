package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> pirates;

    public Ship() {
        this.pirates = new ArrayList<>();
    }

    public void add(Pirate pirate) {
        pirates.add(pirate);
    }

  /*  public List<Pirate> getPoorPirates() {
        return List<Pirate>;
    }*/


}
