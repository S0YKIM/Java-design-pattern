package ex01.case2;
import ex01.case1.Aggregate;
import ex01.case1.Iterator;

public abstract class Factory {
    public final Iterator create(Aggregate list, int type) {
        Iterator p = createProduct(list, type);
        return p;
    }

    protected abstract Iterator createProduct(Aggregate list, int type);
}
