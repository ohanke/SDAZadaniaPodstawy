package com.company.Day1;

import java.util.Scanner;

public class Zad14 {
//    private static final int MAX_INSTALLMENTS_AMOUNT = 48;
//    private static final int MIN_INSTALLMENTS_AMOUNT = 6;
//    private static final int AUTO_INSTALLMENTS_AMOUNT = 36;
//    private static final int MAX_LOAN_AMOUNT = 10000;
//    private static final int MIN_LOAN_AMOUNT = 100;
//    private static final int AUTO_LOAN_AMOUNT = 5000;

    public static void main(String[] args) {
        float loanAmount = getLoanAmount();
        int installmentsAmount = getInstallmentsAmount();
        float calculatedInstallments = getCalculatedInstallments(loanAmount, installmentsAmount);
        System.out.printf("Single Installment: %.2f", calculatedInstallments);
    }

    private static float getCalculatedInstallments(float loanAmount, int installmentsAmount) {
        float procentage;
        if (installmentsAmount <= 12)
            procentage = 2.5f;
        else if (installmentsAmount <= 24)
            procentage = 5f;
        else
            procentage = 10f;

        return (loanAmount/ installmentsAmount) + ((loanAmount / installmentsAmount) * (procentage/100)) ;

    }

    private static int getInstallmentsAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert number of installments: ");
        int installmentsAmount = scanner.nextInt();
        return validateInstallmentsAmount(installmentsAmount);
    }

    private static int validateInstallmentsAmount(int installmentsAmount) {
        int maxInstallmentsAmount = 48;
        int minInstallmentsAmount = 12;
        int autoInstallmentsAmount = 36;

        if (installmentsAmount > maxInstallmentsAmount){
            System.out.println("Number of installments is too big. Default value of " + autoInstallmentsAmount + " was set.");
            return autoInstallmentsAmount;
        }
        else if (installmentsAmount < minInstallmentsAmount){
            System.out.println("Number of installments is too big. Default value of " + autoInstallmentsAmount + " was set.");
            return autoInstallmentsAmount;
        }
        return installmentsAmount;
    }

    private static float getLoanAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert amount: ");
        float loanAmount = scanner.nextInt();
        return validateLoanAmount(loanAmount);
    }

    private static float validateLoanAmount(float loan){
        int maxLoanAmount = 10000;
        int minLoanAmount = 100;
        float autoLoanAmount = 5000f;

        if (loan > maxLoanAmount){
            System.out.println("Loan is too big. Default value " + autoLoanAmount + " was set");
            return autoLoanAmount;
        }
        else if (loan < minLoanAmount){
            System.out.println("Loan is too small. Default value " + autoLoanAmount + " was set");
            return autoLoanAmount;
        }
        return loan;
    }
}