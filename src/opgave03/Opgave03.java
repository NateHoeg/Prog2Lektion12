package opgave03;

import opgave03.models.CollegeTaskA;
import opgave03.models.CollegeTaskB;
import opgave03.models.Student;

public class Opgave03 {
    public static void main(String[] args) {

        Student xiao = new Student(1, "Xiao");
        Student kazuha = new Student(2, "Kazuha");
        Student lyney = new Student(3, "Lyney");
        Student scaramouche = new Student(4, "Scaramouche");

        CollegeTaskA akademiya = new CollegeTaskA("Sumeru Akademiya");
        CollegeTaskB researchInstitute = new CollegeTaskB("Fontaine Research Institute");

        akademiya.addStudent(xiao);
        akademiya.addStudent(kazuha);
        akademiya.addStudent(lyney);
        akademiya.addStudent(scaramouche);

        researchInstitute.addStudent(xiao);
        researchInstitute.addStudent(kazuha);
        researchInstitute.addStudent(lyney);
        researchInstitute.addStudent(scaramouche);

        xiao.addGrade(12);
        xiao.addGrade(12);
        kazuha.addGrade(12);
        lyney.addGrade(12);
        scaramouche.addGrade(12);

        System.out.println(akademiya.calcAverage());
        System.out.println(researchInstitute.calcAverage());

        System.out.println(akademiya.findStudent(3));
        System.out.println(researchInstitute.findStudent(3));

    }


}
