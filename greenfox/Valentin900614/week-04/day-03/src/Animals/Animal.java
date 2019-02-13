package Animals;

public abstract class Animal {

    String name;
    int age;
    String gender;

    abstract String getName();
    abstract String breed();

    public Animal(String _name) {
        name = _name;
    }

    public Animal() {

    }

}
