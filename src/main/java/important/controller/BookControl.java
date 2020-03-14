package important.controller;

import important.bookDao.BookDao;
import important.daoimpl.BookDaoImpl;
import important.model.Books;

import java.util.Scanner;

public class BookControl {
    Scanner scanner = new Scanner(System.in);


    public void addBook() throws InterruptedException {
        BookDao bookDao = new BookDaoImpl();
        int a =5;
        while (a==5) {
            System.out.println("            Book App               " +
                    "\n 1. Create new book" +
                    "\n 2. Display all books" +
                    "\n 3. Delete book" +
                    "\n 4. Change book name" +
                    "\n 5. Exit");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter book id: ");
                    System.out.println();
                    int id = scanner.nextInt();
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    Books book = new Books(id, name);
                    bookDao.saveBook(book);
                    break;
                case 2:

                    System.out.println("________________________________________");
                    for (int i = 0; i < bookDao.getAllBooks().size(); i++) {
                        System.out.println(bookDao.getAllBooks().get(i).getBookName());
                    }
                    System.out.println("________________________________________");

                    break;
                case 3:
                    System.out.print("Enter book id: ");
                    int ids = scanner.nextInt();
                    bookDao.deleteBook(ids);
                    System.out.println("deleting...");
                    wait(4);
                    System.out.println("Deleted");
                    break;
                case 4:
                    System.out.print("Enter book id: ");
                    int idl = scanner.nextInt();
                    System.out.println();
                    System.out.println("Write new name: ");
                    String newName = scanner.nextLine();
                    bookDao.getBookById(idl).setBookName(newName);
                    break;
                case 5:
                    a=0;
                default:
                    System.out.println("Smt went wrong try again");
            }
        }


    }



}
