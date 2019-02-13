package Animals;

public class Bird extends Animal {

    public Bird(String _name) {
        super(_name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String breed() {
        return "laying eggs";
    }
}
