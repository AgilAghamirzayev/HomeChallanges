package important;

import important.bookDao.BookDao;
import important.controller.BookControl;
import important.daoimpl.BookDaoImpl;
import important.model.Books;

public class AcessBook {
    public static void main(String[] args)  {
//        BookControl bookControl= new BookControl();
//        bookControl.addBook();

        BookDao bookDao = new BookDaoImpl();
        Books cpp = new Books(4,"C++");
        Books c = new Books(5,"C");
        Books csharp = new Books(6,"C#");

        for (int i = 0; i <bookDao.getAllBooks().size() ; i++) {
            System.out.println(bookDao.getAllBooks().get(i).getBookName());
        }
        System.out.println("--------------------------------------------------");
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
        bookDao.saveBook(c);
        bookDao.saveBook(cpp);
        bookDao.saveBook(csharp);
        System.out.println("--------------------------------------------------");
        for (int i = 0; i <bookDao.getAllBooks().size() ; i++) {
            System.out.println(bookDao.getAllBooks().get(i).getBookName());
        }
        System.out.println("--------------------------------------------------");
        //bookDao.deleteBook(cpp);
        for (int i = 0; i <bookDao.getAllBooks().size() ; i++) {
            System.out.println(bookDao.getAllBooks().get(i).getBookName());
        }
        System.out.println("--------------------------------------------------");
        for (Books books: bookDao.getAllBooks()){
            System.out.println("Book ID: " + books.getId());
        }
        System.out.println("--------------------------------------------------");

        System.out.println(cpp.getBookName());
        System.out.println(bookDao.getBookById(2).getBookName());
        System.out.println(bookDao.getBookById(2).getId());


   }
}
