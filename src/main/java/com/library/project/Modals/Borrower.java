package com.library.project.Modals;
//  Borrowers can be registered in the system. Each borrower should have a name, contact information, and a unique borrower ID.

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Document
public class Borrower {
    @Id
     String _Id;
    String broName;
    double contact;
   
    
}
