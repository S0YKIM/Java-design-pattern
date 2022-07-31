package ex01;

public class MajorStrategy implements GradeStrategy {
    public void showGrade(String name, int score) {
        if (score >= 95)
            System.out.println(name + ": S");
        else if (score >= 90)
            System.out.println(name + ": A");
        else if (score >= 80)
            System.out.println(name + ": B");
        else if (score >= 70)
            System.out.println(name + ": C");
        else if (score >= 60)
            System.out.println(name + ": D");
        else
            System.out.println(name + ": F");
    }
}
