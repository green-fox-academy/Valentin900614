package Animals;

public class Mammal extends Animal {

    public Mammal(String _name) {
        super(_name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out";
    }
}
