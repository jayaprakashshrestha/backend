package com.library.project.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.project.Modals.Book;
import com.library.project.Modals.DataModal;
import com.library.project.Repository.BookRepository;


@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    BookRepository bookRepo;

   
    
    @GetMapping("/Book")
    public DataModal getAllBook(){
        return new DataModal(200,"Book get successfully",bookRepo.findAll());
        

    }
    @PostMapping("/addBook")
    public DataModal addBook(@RequestBody Book book){
        book=bookRepo.save(book);
        return new DataModal(200,"book added successfully" , book);
    }
    @PostMapping("/updateBook")
    public DataModal updateBook(@RequestBody Book book) {
        bookRepo.save(book);
        return new DataModal(200, "book updated successfuly", book);
    }
    
    @DeleteMapping("/{id}")
    public DataModal deleteBookByTitle(@PathVariable String id) {
        // Book book = bookRepo.findById(id);

        // if (book == null) {
        //     return new DataModal(404, "Book not found", null);
        // }

        bookRepo.deleteById(id);

        return new DataModal(200, "Book deleted successfully", id);
    }
}
