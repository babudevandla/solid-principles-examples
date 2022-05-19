package com.solid.principles.examples.DIP.problem;

//Dependency Inversion Principle (DIP) 

/**
 * 
 * The principle states that we must use abstraction (abstract classes and
 * interfaces) instead of concrete implementations. High-level modules should
 * not depend on the low-level module but both should depend on the abstraction
 * 
 * let’s consider an best use case
 * 
 * You go to a local store to buy something, and you decide to pay for it by
 * using your card. So, when you give your card to the clerk for making the
 * payment, the clerk doesn’t bother to check what kind of card you have given.
 * 
 * Even if you have given a debit card or credit card it not even matter; they
 * will simply swipe it. this is what the abstraction between clerk and you to
 * relay on Card processing
 * 
 * now let’s replace this example in code to understand it better .
 * 
 * let’s assume you have two option to do payments Debit card and Credit card
 *
 */
class DebitCard {
	public void doTransaction(int amount) {
		System.out.println("tx done with DebitCard");
	}
}

class CreditCard {
	public void doTransaction(int amount) {
		System.out.println("tx done with CreditCard");
	}
}

/**
 * 
 * Now with this two card you went to shopping mall and purchased some order and
 * decided to pay using CreditCard
 *
 */
public class ShoppingMall {
	private DebitCard debitCard;

	public ShoppingMall(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public void doPayment(Object order, int amount) {
		debitCard.doTransaction(amount);
	}

	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(debitCard);
		shoppingMall.doPayment("some order", 5000);
	}
}

/**
 * if you observe this is wrong design of coding , now ShoppingMall class
 * tightly coupled with DebitCard
 * 
 * now there is some error in your debit card and user want to go with Credit
 * card then this won’t be possible because ShoppingMall is tightly couple with
 * Debit Card
 * 
 * we can do that , remove Debit card from constructor and inject CreditCard.
 * which not good approach to write code because to follow DIP we need to design
 * our application in such a way so that my shopping mall payment system should
 * accept any type of ATM Card (it shouldn’t care whether it is debit or credit
 * card)
 */