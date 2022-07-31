package ex01;

public class BasicStrategy implements GradeStrategy {
    public void showGrade(String name, int score) {
        if (score >= 90)
            System.out.println(name + ": A");
        else if (score >= 80)
            System.out.println(name + ": B");
        else if (score >= 70)
            System.out.println(name + ": C");
        else if (score >= 55)
            System.out.println(name + ": D");
        else
            System.out.println(name + ": F");
    }
}
