package greenfox;

public class Mentor extends Person{

    String level;

    public Mentor (String name, int age, String gender, String level) {
        super.name = name;
        super.age = age;
        super.gender = gender;
        this.level = level;
    }

    public Mentor () {
        super.name = "Jane Doe";
        super.age = 30;
        super.gender = "female";
        this.level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + super.name + ", a " + super.age + " year old " + super.gender + " " + this.level + " mentor.");
    }

}
