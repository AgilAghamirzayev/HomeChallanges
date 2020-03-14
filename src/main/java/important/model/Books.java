package important.model;

public class Books {
    private int id;
    private String bookName;

    public Books(int id, String  bookName){
        this.id=id;
        this.bookName=bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
