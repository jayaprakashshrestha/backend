package com.library.project.Repository;




import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.library.project.Modals.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {








    
    
}
