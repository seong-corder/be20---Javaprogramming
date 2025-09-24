package Main.java.com.jiraffers.service;

import Main.java.com.jiraffers.domain.Book;
import Main.java.com.jiraffers.repository.BookRepository;

import java.util.List;


public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void registerBook(int no, String title, String author) {
        bookRepository.save(new Book(no, title, author));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public boolean borrowBook(int no) {
        Book book = bookRepository.findByNo(no);
        if (book != null && !book.isBorrowed()) {
            book.borrow();
            return true;
        }
        return false;
    }

    public boolean returnBook(int no) {
        Book book = bookRepository.findByNo(no);
        if (book != null && book.isBorrowed()) {
            book.returnBook();
            return true;
        }
        return false;
    }
}
