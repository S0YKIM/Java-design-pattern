package ex00;

public interface AbstractList<T> {
    public void addElement(T obj);
    public T    deleteElement(int i);
    public void insertElement(T obj, int i);
    public T    getElement(int i);
    public int  getElementSize();
}
