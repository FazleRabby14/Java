
package book;

public class Ebook  extends Book{
    private String d_url;
    private double size;

    public Ebook(int isbin, String title, String author, double price, String d_url, double size ) {
        super(isbin, title, author, price);
        this.d_url = d_url;
        this.size = size;
    }

    @Override
    public String toString() {
         return "Book{d_url=" + d_url + ", size=" + size + "toString()=" +super.toString()+ '}';
    }

    public String getD_url() {
        return d_url;
    }

    public void setD_url(String d_url) {
        this.d_url = d_url;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    
}
