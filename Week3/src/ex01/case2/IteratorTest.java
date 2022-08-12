package ex01.case2;
import ex01.case1.Book;
import ex01.case1.BookShelf;
import ex01.case1.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Factory factory = new IteratorFactory();
        {
            BookShelf bookShelf = new BookShelf(4);
            bookShelf.appendBook(new Book("Around the World in 80 Days"));
            bookShelf.appendBook(new Book("Bible"));
            bookShelf.appendBook(new Book("Cinderella"));
//            bookShelf.appendBook(new Book("Daddy-Long-Legs"));
            Iterator it = factory.createProduct(bookShelf, 0);
            while (it.hasNext()) {
                Book book = (Book) it.next();
                System.out.println("" + book.getName());
            }
        }
        {
            BookShelf bookShelf = new BookShelf(4);
            bookShelf.appendBook(new Book("Around the World in 80 Days"));
            bookShelf.appendBook(new Book("Bible"));
            bookShelf.appendBook(new Book("Cinderella"));
//            bookShelf.appendBook(new Book("Daddy-Long-Legs"));
            Iterator rit = factory.createProduct(bookShelf, 1);
            while (rit.hasNext()) {
                Book book = (Book) rit.next();
                System.out.println("" + book.getName());
            }
        }
    }
}
