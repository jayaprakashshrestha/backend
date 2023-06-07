package com.library.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.library.project.Modals.Author;

public interface AuthorRepository extends MongoRepository<Author,String> {
    
}
