package com.library.project.Controllers;
// Authors can be added, updated, and deleted from the system. Each author should have a name and a biography.


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.project.Modals.Author;
import com.library.project.Modals.DataModal;
import com.library.project.Repository.AuthorRepository;

@RestController
public class AuthorController {
    @Autowired
    AuthorRepository authorRepo;
    @PostMapping("/addAuthor")
    public DataModal addAuthor(@RequestBody Author author){
        author=authorRepo.save(author);
        
         return new DataModal(200,"Author added successfully" , author);
    }
    @PostMapping("/updateAuthor")
    public DataModal updateAuthor(@RequestBody Author author){
        authorRepo.save(author);
        return new DataModal(200,"Author updated successfully" , author);
    }
    @PostMapping("/deletAuthor")
    public DataModal deletModal(@RequestBody Author author){
        authorRepo.delete(author);
        return new DataModal(200, "Author Deleted successfully", author);
    }
}
