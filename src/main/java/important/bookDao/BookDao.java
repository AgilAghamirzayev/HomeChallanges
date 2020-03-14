package important.bookDao;

import important.model.Books;

import java.util.List;

public interface BookDao {
    List<Books> getAllBooks();
    Books getBookById(int id);
    void saveBook(Books book);
    void deleteBook(int book);
}
