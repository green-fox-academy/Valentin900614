public class Fox {

    private String name;
    private String color;
    private int age;

    public Fox(String _name, String _color, int _age) {
        name = _name;
        color = _color;
        age = _age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
