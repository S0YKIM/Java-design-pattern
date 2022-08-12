package ex01.case1;

public interface Aggregate {
    public abstract Iterator iterator();
    public abstract Iterator reverseIterator();
    public int getLength();
}