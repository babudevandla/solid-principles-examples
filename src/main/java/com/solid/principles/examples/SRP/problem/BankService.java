package com.solid.principles.examples.SRP.problem;

//Single Responsibility Principle

/**
 * 
 * This principle states that “a class should have only one reason to change”
 * which means every class should have a single responsibility or single job or
 * single purpose
 * 
 * 
 * The principle can be well understood with an example. Imagine there is a
 * class called BankService which performs following operations.
 * 
 * 1. Withdraw 
 * 2. Deposit 
 * 3. Print Pass Book 
 * 4. Get Loan Info 
 * 5. Send OTP
 *
 *
 * Have you imagined the scenario? Here the class has multiple reasons to
 * change.
 * 
 * For example look into getLoanInterestInfo() method , now bank service provide
 * only info for Personal Loan , Home Loan and car loan let’s say in future bank
 * people want to provide some other loan feature like gold loan and study loan
 * then again you need to modify this class implementation right ?
 * 
 * similarly you can consider sendOTP() method , let’s assume BankService
 * support send OTP medium as a email but in future they might want to
 * introduced send OTP medium as Phone then again you need to change its
 * implementation
 * 
 * it doesn’t follow single responsibility principle because this class has to
 * many responsible or task to perform
 * 
 * 
 * To achieve the goal of the single responsibility principle, we should
 * implement a separate class that performs a single functionality only.
 * 
 * For Example , we can move Print related code snippet to Printer Service
 * 
 * 
 */

public class BankService {

	public long deposit(long amount, String accountNo) {
		// deposit amount
		return 0;
	}

	public long withDraw(long amount, String accountNo) {
		// withdraw amount
		return 0;
	}

	public void printPassbook() {
		// update transaction info in passbook
	}

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeLoan")) {
			// do some job
		}
		if (loanType.equals("personalLoan")) {
			// do some job
		}
		if (loanType.equals("car")) {
			// do some job
		}
	}

	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			// write email related logic
			// use JavaMailSenderAPI
		}
	}

}
