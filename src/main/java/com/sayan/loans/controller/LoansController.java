package com.sayan.loans.controller;

import com.sayan.loans.model.Customer;
import com.sayan.loans.model.Loans;
import com.sayan.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/myLoans")
    public List<Loans> getLoansDetails(@RequestBody Customer customer) {
        Optional<List<Loans>> optLoans = Optional.of(loansRepository.findByCustomerIdOrderByStartDateDesc(customer.getCustomerId()));
        return optLoans.orElse(null);
    }
}
