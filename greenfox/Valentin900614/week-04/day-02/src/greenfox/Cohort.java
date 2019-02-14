package greenfox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    String name;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

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
        System.out.println("The " + this.name + " cohort has " + this.students.size() + " students and " + this.mentors.size() + " mentors.");
    }

}
