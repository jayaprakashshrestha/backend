package com.library.project.Modals;
//  Authors can be added, updated, and deleted from the system. Each author should have a name and a biography.

public class Author {
    private String authName;
    private String biography;
    public Author() {
    }
    public Author(String authName, String biography) {
        this.authName = authName;
        this.biography = biography;
    }
    public String getAuthName() {
        return authName;
    }
    public void setAuthName(String authName) {
        this.authName = authName;
    }
    public String getBiography() {
        return biography;
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }
    
    
}
