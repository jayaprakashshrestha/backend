package com.library.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.project.Modals.Borrower;
import com.library.project.Modals.DataModal;
import com.library.project.Repository.BorrowerRepository;

@RestController
public class BorrowerController {
    @Autowired
    BorrowerRepository borrowerRepo;

    @PostMapping("/addBorrower")
    public DataModal addBorrower(@RequestBody Borrower borrower) {
        borrower = borrowerRepo.save(borrower);
        return new DataModal(200, "Borrower added successfully", borrower);
    }

    @PostMapping("/updateBorrower")
    public DataModal updateBorrower(@RequestBody Borrower borrower) {
        borrowerRepo.save(borrower);
        return new DataModal(200, "Borrower updated successfully", borrower);
    }

    @PostMapping("/deleteBorrower")
    public DataModal deleteBorrower(@RequestBody Borrower borrower) {
        borrowerRepo.delete(borrower);
        return new DataModal(200, "Borrower deleted successfully", borrower);
    }
}
