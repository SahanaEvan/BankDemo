package com.example.demo;

import java.util.Scanner;

public class LoanProcessingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter PAN number: ");
        String panNumber = scanner.nextLine();
        System.out.print("Enter contact: ");
        String contact = scanner.nextLine();
        System.out.print("Enter loan amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        LoanRequest loanRequest = new LoanRequest(name, panNumber, contact, amount);

        LoanApprovalHandler branchManagerHandler = new BranchManagerHandler();
        LoanApprovalHandler headBranchManagerHandler = new HeadBranchManagerHandler();
        branchManagerHandler.setNextHandler(headBranchManagerHandler);

        branchManagerHandler.processLoanRequest(loanRequest);
    }
}

