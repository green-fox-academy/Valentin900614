package Pirates;

public class Pirates {

    String name;
    int gold;
    int healthPoints;
    boolean isCaptain;
    boolean woodenLeg;

    public Pirates () {
        healthPoints = 10;
    }

    public Pirates (String _name, int _gold, boolean _isCaptain, boolean _woodenLeg) {
        name = _name;
        gold = _gold;
        isCaptain = _isCaptain;
        woodenLeg = _woodenLeg;
        healthPoints = 10;
    }

    public void work () {
        if (this.isCaptain) {
            this.gold += 10;
            this.healthPoints -= 5;
        } else {
            this.gold += 1;
            this.healthPoints -= 1;
        }
    }

    public void party () {
        if (this.isCaptain) {
            this.healthPoints += 10;
        }
        this.healthPoints += 1;
    }

    public String isWoodLeg () {
        if (this.woodenLeg) {
            return "Hello, I'm Jack. I have a wooden leg and " + this.gold + " golds.";
        } else
            return "Hello, I'm Jack. I still have my real legs and " + this.gold + " golds.";
    }

}
