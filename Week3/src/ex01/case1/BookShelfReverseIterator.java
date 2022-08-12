package ex01.case1;

import ex00.Iterator;

public class BookShelfReverseIterator implements Iterator {
    BookShelf bookshelf;
    int position;

    public BookShelfReverseIterator(BookShelf bookshelf) {
        this.bookshelf = bookshelf;
        position = bookshelf.getCurrPosition();
    }

    @Override
    public void initPosition() {
        position = bookshelf.getCurrPosition();
    }
    @Override
    public boolean hasNext() {
        if (position <= 0)
            return false;
        return true;
    }

    @Override
    public Object next() {
        return bookshelf.getBookItem(--position);
    }
}
