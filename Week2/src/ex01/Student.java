package ex01;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, boolean majorCode) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        if (majorCode)
            subject.strategy = new MajorStrategy();
        else
            subject.strategy = new BasicStrategy();
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        System.out.println("*****************************");
        System.out.println("이름: " + studentName);
        Iterator<Subject> it = subjectList.iterator();
        Subject curr;
        while (it.hasNext()) {
            curr = it.next();
            curr.showGrade();
        }
        System.out.println("*****************************");
    }
}
