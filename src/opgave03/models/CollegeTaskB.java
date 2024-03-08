package opgave03.models;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollegeTaskB {

    private String name;
    private Set<Student> students = new LinkedHashSet<>();

    public CollegeTaskB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calcAverage() {
        double allGradesAdded = 0;
        double numberOfGrades = 0;
        for (Student student : students) {
            List<Integer> studentGrades = student.getGrades();
            for (Integer studentGrade : studentGrades) {
                allGradesAdded += studentGrade;
                numberOfGrades++;
            }
        }
        return allGradesAdded/numberOfGrades;
    }

    public Student findStudent(int studentNo) {
        Student student = null;
        for (Student student1 : students) {
            if(student1.getStudentNo() == studentNo) {
                student = student1;
            }
        }
        return student;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                '}';
    }

}
