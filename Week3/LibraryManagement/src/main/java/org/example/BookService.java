package org.example;
public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // Constructor for Constructor Injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor called: Service Name = " + serviceName);
    }

    // Setter for Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("[" + serviceName + "] Adding book: " + bookName);
        bookRepository.saveBook(bookName);
    }
}
