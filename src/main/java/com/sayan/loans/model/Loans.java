package com.sayan.loans.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @ToString
public class Loans {

    @Id
    @Column(name = "loan_number")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loanNumber;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "start_dt")
    private LocalDate startDate;
    @Column(name = "loan_type")
    private String loanType;
    @Column(name = "total_loan")
    private int totalLoan;
    @Column(name = "amount_paid")
    private int amountPaid;
    @Column(name = "outstanding_amount")
    private int outstandingAmount;
    @Column(name = "create_dt")
    private LocalDate createDate;
}
