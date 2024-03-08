package opgave03.models;

import java.util.ArrayList;
import java.util.List;

public class CollegeTaskA {

    private String name;
    private List<Student> students = new ArrayList<>();

    public CollegeTaskA(String name) {
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
        int i = 0;
        boolean found = false;
        while(i < students.size() && !found) {
            if(students.get(i).getStudentNo() == studentNo) {
                found = true;
                student = students.get(i);
            }
            i++;
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
