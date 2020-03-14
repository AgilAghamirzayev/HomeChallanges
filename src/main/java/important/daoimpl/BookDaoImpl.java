package important.daoimpl;

import important.bookDao.BookDao;
import important.model.Books;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private List<Books> books;

    public BookDaoImpl(){
        books = new ArrayList<>();
        books.add(new Books(1,"Java"));
        books.add(new Books(2,"Python"));
        books.add(new Books(3,"Android"));
    }


    @Override
    public List<Books> getAllBooks() {
        return books;
    }

    @Override
    public Books getBookById(int id) {
        return books.get(id);
    }

    @Override
    public void saveBook(Books book) {
        books.add(book);
    }

    @Override
    public void deleteBook(int id) {
        books.remove(books.get(id));
    }
}
