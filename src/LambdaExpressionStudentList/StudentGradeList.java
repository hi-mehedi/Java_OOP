package LambdaExpressionStudentList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGradeList {
    String name;
    int Score;

    public StudentGradeList(String name, int Score){
        this.name = name;
        this.Score = Score;
    }

    public void printInfo(){
        System.out.println("Student Name :"+name);
        System.out.println("Exam Score :"+Score);
    }
}
class Main{
    public static void main(String[] args) {
        List<StudentGradeList> student = Arrays.asList(
                new StudentGradeList("Mehedi", 95),
                new StudentGradeList("Hasan", 99),
                new StudentGradeList("Habib", 100),
                new StudentGradeList("Sahin", 85),
                new StudentGradeList("Anik", 75),
                new StudentGradeList("Bot", 35),
                new StudentGradeList("Bot2", 60)
        );

       student.forEach(StudentGradeList::printInfo);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        List<StudentGradeList> filter1 = student.stream().filter(n->n.Score>80).collect(Collectors.toList());
        filter1.forEach(StudentGradeList::printInfo);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>des");
        student.sort((a,b)-> b.Score-a.Score);
        student.forEach(StudentGradeList::printInfo);
    }
}
