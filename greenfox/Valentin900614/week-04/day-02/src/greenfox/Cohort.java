package greenfox;

import java.util.ArrayList;

public class Cohort {

    String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();

    public Cohort (String name) {
        this.name = name;
        students.clear();
        mentors.clear();
    }

    public void addStudent (Student student) {
        students.add(student);
    }
    public void addMentor (Mentor mentor) {
        mentors.add(mentor);
    }

    public void info () {
        System.out.println("The name " + this.name + " has " + this.students.size() + " students and " + this.mentors.size() + " mentors.");
    }

}
