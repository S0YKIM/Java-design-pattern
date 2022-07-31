package ex01;

public class Subject {
    public GradeStrategy strategy;
    private String name;
    private int scorePoint;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScorePoint() {
        return scorePoint;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
    public void showGrade() {
        strategy.showGrade(name, scorePoint);
    }
}
