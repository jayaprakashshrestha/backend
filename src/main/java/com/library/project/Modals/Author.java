package com.library.project.Modals;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//  Authors can be added, updated, and deleted from the system. Each author should have a name and a biography.
@Setter
@Getter
@AllArgsConstructor
@Document(collation = "auth")
public class Author {
    private String authName;
    private String biography;
   
    
    
}
