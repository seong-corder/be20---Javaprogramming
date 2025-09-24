package Main.java.com.jiraffers.ui;

import Main.java.com.jiraffers.domain.Book;
import Main.java.com.jiraffers.service.BookService;

import java.util.List;
import java.util.Scanner;


public class Application {
    private final BookService bookService;
    private final Scanner scanner = new Scanner(System.in);

    public Application(BookService bookService) {
        this.bookService = bookService;
    }

    public void start() {
        while (true) {
            System.out.println("\n📚 도서 대출 시스템");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 보기");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1 -> registerBook();
                case 2 -> showBooks();
                case 0 -> {
                    System.out.println("👋 종료합니다.");
                    return;
                }
                default -> System.out.println("❗잘못된 선택입니다.");
            }
        }
    }

    private void registerBook() {
        System.out.print("번호: ");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();

        bookService.registerBook(no, title, author);
        System.out.println("✔️ 등록 완료");
    }

    private void showBooks() {
        List<Book> books = bookService.getAllBooks();
        for (Book book : books) {
            System.out.printf("번호: %d, 제목: %s, 저자: %s\n",
                    book.getNo(), book.getTitle(), book.getAuthor());
        }
    }

}
