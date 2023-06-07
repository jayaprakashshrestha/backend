package com.library.project.Repository;




import org.springframework.data.mongodb.repository.MongoRepository;


import com.library.project.Modals.Book;


public interface BookRepository extends MongoRepository<Book, String> {








    
    
}
