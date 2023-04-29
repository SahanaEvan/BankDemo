package com.example.demo;

public class BranchManagerHandler extends LoanApprovalHandler {
    private static final double MAX_APPROVAL_AMOUNT = 500000.0;

    
    public void processLoanRequest(LoanRequest request) {
        if (request.getAmount() <= MAX_APPROVAL_AMOUNT) {
            System.out.println("Loan request approved by Branch Manager");
        } else if (nextHandler != null) {
            nextHandler.processLoanRequest(request);
        }
    }
}