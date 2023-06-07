package com.library.project.Modals;
//  Borrowers can be registered in the system. Each borrower should have a name, contact information, and a unique borrower ID.


public class Borrower {
    private String borrowerId;
    private String broName;
    private double contact;
    public Borrower() {
    }
    public Borrower(String borrowerId, String broName, double contact) {
        this.borrowerId = borrowerId;
        this.broName = broName;
        this.contact = contact;
    }
    public String getBorrowerId() {
        return borrowerId;
    }
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }
    public String getBroName() {
        return broName;
    }
    public void setBroName(String broName) {
        this.broName = broName;
    }
    public double getContact() {
        return contact;
    }
    public void setContact(double contact) {
        this.contact = contact;
    }
    
}
