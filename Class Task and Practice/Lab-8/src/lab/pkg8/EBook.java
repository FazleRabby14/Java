
package lab.pkg8;


public class EBook extends Book {
    
    private String url;
    private int sizeMB;

    public EBook(String title, String author, double price, String url, int sizeMB, int isbn) {
        super(isbn, title, author, price);
        this.url = url;
        this.sizeMB = sizeMB;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(int sizeMB) {
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        return "EBook{" + "Author="+super.getAuthor()+ ", url=" + url + ", sizeMB=" + sizeMB + ", price="+super.getPrice()+ '}';
    }
    
    
}
