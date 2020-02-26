package exercises.bookAndAuthor;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[3];

        authors[0] = new Author("Aqil", "aqilzeka99@gmail.com", 'm');
        authors[1] = new Author("Nazrin", "nazrin@gmail.com",'f');
        authors[2] = new Author("a","b", 'c');

        Book book1 = new Book("Brain", authors, 20.50, 99);

        System.out.println(book1);

    }
}
