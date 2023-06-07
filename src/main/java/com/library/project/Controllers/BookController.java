package com.library.project.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.project.Modals.Book;
import com.library.project.Services.BookServics;

@RestController
public class BookController {
    private BookServics service;

    public BookController(BookServics service) {
        this.service = service;
    }
    @GetMapping("/Book")
    public List<Book> getAllBook(){
        return service.getAllBook();

    }
    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }
    @PutMapping("/Books/{title}")
    public void updateBook(@PathVariable String title, @RequestBody Book book) {
        // Assuming 'title' represents the book ID, you can update the other properties of the 'book' object.
        service.updateBook(book);
    }
    
    @DeleteMapping("/Book/{title}")
    public void deleteBook(@PathVariable String title){
        service.deleteBook(title);
    }
}
