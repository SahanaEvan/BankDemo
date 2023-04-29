package com.example.demo;

public abstract class LoanApprovalHandler {
    protected LoanApprovalHandler nextHandler;

    public void setNextHandler(LoanApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void processLoanRequest(LoanRequest request);
}
