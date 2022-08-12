package ex00;

public class BookShelfIterator implements Iterator {
    BookShelf bookshelf;
    int position = 0;

    public BookShelfIterator(BookShelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    @Override
    public void initPosition() {
        position = 0;
    }
    @Override
    public boolean hasNext() {
        if (position >= bookshelf.getLength() || bookshelf.getBookItem(position) == null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        return bookshelf.getBookItem(position++);
    }
}
