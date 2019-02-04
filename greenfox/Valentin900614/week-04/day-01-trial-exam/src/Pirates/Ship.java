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

    public int getGolds() {
        int sum = 0;

        for (int i = 0; i < pirates.size(); i++) {
       //     sum += this.gold;
        }

        return sum;
    }

    public void lastDayOnTheShip() {
  //      pirates.party();
    }

}
