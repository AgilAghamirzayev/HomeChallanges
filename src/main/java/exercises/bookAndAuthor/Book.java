package exercises.bookAndAuthor;

public class Book{

    String name;
    static Author[] authors;
    double price;
    int qty=0;

    Book(String name, Author[] author, double price){
        this.name = name;
        this.authors = author;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }



    public String getName() {
        return name;
    }

    public String  getAuthorName( ) {
        return  Author.name;
    }

    public StringBuilder getAuthors() {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < authors.length ; i++) {
        stringBuilder.append(authors[i]);
        }
        return stringBuilder;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book [ name = " + getName() + ", authors={"+ getAuthors() + "} price = " + getPrice()
                + ", qty = " + getQty() + "]";
    }
}
