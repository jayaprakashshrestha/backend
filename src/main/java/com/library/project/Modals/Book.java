package com.library.project.Modals;





import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Document
public class Book {
    @Id
    String _id;
    String title;
     String name; 
     String authName;
    int publicationYear;
     String isbnNumber;
   
    }
    

    

