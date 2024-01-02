package book;

public class main {
    public static void main(String[ ] args)
    {
        Ebook eb=new Ebook(12,"cse215","Karim",120,"asdf",25.3);
        System.out.println(eb.toString());
        PaperBook pb=new PaperBook(12,"cse215","Karim",120,150,25.3);
        System.out.println(pb.toString());
    }
}
