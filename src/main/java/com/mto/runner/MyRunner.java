package com.mto.runner;

import com.mto.entity.Customer;
import com.mto.entity.Loan;
import com.mto.repository.CustomerRepository;
import com.mto.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    LoanRepository loanRepo;

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer();
        customer.setCustomerId(10001);
        customer.setCustomerName("Mario");

        Loan personal = new Loan();
        personal.setLoanId("LN-P12100");
        personal.setAmount(25222.00);
        personal.setLoanType("PERSONAL");

        Loan home = new Loan();
        home.setLoanId("LN-H12000");
        home.setAmount(35111.00);
        home.setLoanType("PERSONAL");

        personal.setCustomer(customer);
        home.setCustomer(customer);
        loanRepo.save(personal);
        loanRepo.save(home);
    }
}
