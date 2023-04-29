package com.example.demo;

public class HeadBranchManagerHandler extends LoanApprovalHandler {
    
    public void processLoanRequest(LoanRequest request) {
        System.out.println("Loan request approved by Head Branch Manager");
    }
}
