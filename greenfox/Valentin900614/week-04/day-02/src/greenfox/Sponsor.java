package greenfox;

public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public Sponsor () {
        super.name = "Jane Doe";
        super.age = 30;
        super.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor (String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public void introduce () {
        System.out.println("Hi, I'm " + super.name + ", a " + super.age + " year old " + super.gender + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    public void getGoal () {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire () {
        this.hiredStudents++;
    }

}
