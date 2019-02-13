package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirates> list;

    public Ship () {
        list = new ArrayList<Pirates>();
    }

    public void add (Pirates pirates) {
        int count = 0;
        if (pirates.isCaptain) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isCaptain) {
                    count++;
                }
            }
        }
        if (count == 0)
            list.add(pirates);
    }

    public List<Pirates> getPoorPirates (List<Pirates> list) {
        List<Pirates> poorPirates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).woodenLeg && list.get(i).gold < 15) {
                poorPirates.add(list.get(i));
            }
        }
        return poorPirates;
    }

    public int getGolds (List<Pirates> list) {
        int sumGold = 0;
        for (int i = 0; i < list.size(); i++) {
            sumGold += list.get(i).gold;
        }
        return sumGold;
    }

    private void lastDayOnTheShip (List<Pirates> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).party();
        }
    }

    public void prepareForBattle (List<Pirates> list) {
        int times = 0;
        while (times < 5) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).work();
            }
            times++;
        }

        lastDayOnTheShip(list);

    }

}
