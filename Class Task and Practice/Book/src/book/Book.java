
package book;


public class Book {

    private int isbin;
    private String title,author;
    private double price;

    public Book(int isbin, String title, String author, double price) {
        this.isbin = isbin;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "isbin=" + isbin + ", title=" + title + ", author=" + author + ", price=" + price + '}';
    }

    public int getIsbin() {
        return isbin;
    }

    public void setIsbin(int isbin) {
        this.isbin = isbin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
