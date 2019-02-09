package teachersandstudents;

public class Student {

    public void learn() {
        System.out.println("Köszönöm, tanár úr!");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }

}
