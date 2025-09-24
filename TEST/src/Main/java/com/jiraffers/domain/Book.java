package Main.java.com.jiraffers.domain;

public class Book {
    private int no;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int no, String title, String author) {
        this.no = no;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getNo() { return no; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }

    public void borrow() { this.isBorrowed = true; }
    public void returnBook() { this.isBorrowed = false; }

}
