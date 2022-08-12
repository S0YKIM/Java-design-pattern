package ex00;

public class BookShelf implements Aggregate {
    private Book[] books;
    int     maxCount;
    private int     position = 0;
    public BookShelf(int cnt) {
        this.books = new Book[cnt];
        maxCount = cnt;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public Iterator reverseIterator() {
        return new BookShelfReverseIterator(this);
    }

    @Override
    public int  getLength() {
        return maxCount;
    }

    public int  getCurrPosition() {
        return position;
    }
    public Book getBookItem(int idx) {
        return books[idx];
    }

    public void appendBook(Book book) {
        if (position >= maxCount) {
            System.out.println("더 이상 추가할 수 없습니다.");
        }
        else {
            books[position] = book;
            position++;
        }
    }
}
