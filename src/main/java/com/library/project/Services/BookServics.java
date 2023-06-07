package com.library.project.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.project.Modals.Book;
import com.library.project.Repository.BookRepository;
@Service
public class BookServics {
    private BookRepository repository;

    public BookServics(BookRepository repository) {
        this.repository = repository;
    }
    public List<Book> getAllBook(){
        return repository.findAll();


    }
    public void addBook(Book book){
        repository.save(book);
    }
    
    public void updateBook(Book book) {
        // Retrieve the existing book from the repository
        Book existingBook = repository.findByTitle(book.getTitle());
    
        // Check if the book exists
        if (existingBook != null) {
            // Update the fields of the existing book with the new values
            existingBook.setName(book.getName());
            existingBook.setAuthName(book.getAuthName());
            existingBook.setPublicationYear(book.getPublicationYear());
            existingBook.setIsbnNumber(book.getIsbnNumber());
    
            // Save the updated book back to the repository
            repository.save(existingBook);
        }
    }
    public void deleteBook(String title){
        repository.deleteById(title);
    }
}
