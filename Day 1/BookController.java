package com.example.ooplab.week1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    public BookController() {

        books.add(new Book(
                1,
                "Java Programming",
                "James Gosling",
                "Tech Publications",
                2022,
                "ISBN101",
                500
        ));

        books.add(new Book(
                2,
                "Python Basics",
                "Guido",
                "ABC Publications",
                2023,
                "ISBN102",
                450
        ));

        books.add(new Book(
                3,
                "Data Structures",
                "Mark Allen",
                "XYZ Publications",
                2021,
                "ISBN103",
                600
        ));
    }

    // Display all books
    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    // Add book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    // Search by title or author
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String keyword) {

        return books.stream()
                .filter(book -> book.matches(keyword))
                .collect(Collectors.toList());
    }

    // Apply discount
    @PutMapping("/{id}/discount")
    public String applyDiscount(
            @PathVariable int id,
            @RequestParam double percentage) {

        for (Book book : books) {

            if (book.getId() == id) {
                book.applyDiscount(percentage);

                return "Discount applied successfully. New price = "
                        + book.getPrice();
            }
        }

        return "Book not found";
    }
}
