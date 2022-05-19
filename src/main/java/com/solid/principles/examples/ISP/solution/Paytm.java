package com.solid.principles.examples.ISP.solution;

/**
 * 
 * Now we can remove getCashBackAsCreditBalance from UPIPayments interface .
 * 
 * Based on client need we segregate interface , let’s say paytm now implements
 * from UPIPayments then as a client we are not forcing him anything to use .
 * which follow ISP
 *
 */
public class Paytm implements UPIPayments {

	@Override
	public void payMoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getScratchCard() {
		// TODO Auto-generated method stub

	}

}
