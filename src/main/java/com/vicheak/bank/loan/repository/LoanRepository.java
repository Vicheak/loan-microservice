package com.vicheak.bank.loan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vicheak.bank.loan.entity.Loan;

public interface LoanRepository extends MongoRepository<Loan, Long>{

	
	
}
