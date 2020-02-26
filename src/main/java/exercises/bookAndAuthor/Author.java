package exercises.bookAndAuthor;

public class Author {

   static String name;
   static String email;
   static char gender;


    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " Author [ name = " + Book.authors[0].toString();
    }
}
