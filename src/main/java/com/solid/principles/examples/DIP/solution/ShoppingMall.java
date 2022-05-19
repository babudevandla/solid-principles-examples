package com.solid.principles.examples.DIP.solution;

/**
 * 
 * Now if you observe shopping mall is loosely coupled with BankCard , any type
 * of card process the payment without any impact . which proofs DIP
 *
 */
public class ShoppingMall {
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPayment(Object order, int amount) {
		bankCard.doTransaction(amount);
	}

	public static void main(String[] args) {
		BankCard bankCard = new CreditCard();
		ShoppingMall shoppingMall1 = new ShoppingMall(bankCard);
		shoppingMall1.doPayment("do some order", 10000);
	}
}