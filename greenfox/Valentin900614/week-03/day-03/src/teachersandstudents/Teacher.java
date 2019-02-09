package teachersandstudents;

public class Teacher {

    public void answer(){
        System.out.println("Ez a válasz!");
    }

    public void teach(Student student) {
        student.learn();
    }

}
