package Main.java.com.jiraffers.repository;

import Main.java.com.jiraffers.domain.Book;
import java.util.List;

public interface BookRepository {
    void save(Book book);
    Book findByNo(int no);
    List<Book> findAll();
}
