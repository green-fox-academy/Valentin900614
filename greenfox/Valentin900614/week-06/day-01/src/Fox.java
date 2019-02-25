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

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
