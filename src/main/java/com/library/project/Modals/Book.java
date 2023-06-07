package com.library.project.Modals;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    String title;
     String name; 
     String authName;
    int publicationYear;
     String isbnNumber;
   
    }
    

    
}
