package com.library.project.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.library.project.Modals.Borrower;

public interface BorrowerRepository extends MongoRepository<Borrower,String> {
    
}
