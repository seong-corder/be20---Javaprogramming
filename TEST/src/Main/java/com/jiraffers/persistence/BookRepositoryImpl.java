package Main.java.com.jiraffers.persistence;

import Main.java.com.jiraffers.domain.Book;
import Main.java.com.jiraffers.repository.BookRepository;

import java.util.*;

public class BookRepositoryImpl implements BookRepository {

    private final Map<Integer, Book> books = new HashMap<>();

    @Override
    public void save(Book book) {
        books.put(book.getNo(), book);
    }

    @Override
    public Book findByNo(int no) {
        return books.get(no);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
