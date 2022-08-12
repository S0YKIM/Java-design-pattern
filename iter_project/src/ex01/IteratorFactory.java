package ex01;

import ex00.Aggregate;
import ex00.Iterator;

public class IteratorFactory extends Factory{
    @Override
    protected Iterator createProduct(Aggregate list, int type) {
        if (type == 0)
            return list.iterator();
        else if (type == 1)
            return list.reverseIterator();
        System.out.println("올바른 타입을 입력하세요.");
        System.out.println("0: 정방향 반복자 | 1: 역방향 반복자");
        return null;
    }
}
