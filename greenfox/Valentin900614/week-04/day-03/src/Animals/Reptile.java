package Animals;

public class Reptile extends Animal {

    public Reptile(String _name) {
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
