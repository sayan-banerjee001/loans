package com.sayan.loans.repository;

import com.sayan.loans.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Integer> {

    List<Loans> findByCustomerIdOrderByStartDateDesc(int customerId);
}
