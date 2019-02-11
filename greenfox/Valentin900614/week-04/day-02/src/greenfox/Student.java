package greenfox;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public Student (String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student () {
        super.name = "Jane Doe";
        super.age = 30;
        super.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public void getGoal () {
        System.out.println("Be a junior software developer.");
    }

    public void introduce () {
        System.out.println("Hi, I'm " + super.name + ", a " + super.age + " year old " + super.gender + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from this course already.");
    }

    public void skipDays (int numberOfDays) {
       this.skippedDays += numberOfDays;
    }

}
