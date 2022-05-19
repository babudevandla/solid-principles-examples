package com.solid.principles.examples.SRP.solution;

public class NotificationService {
	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			// write email related logic
			// use JavaMailSenderAPI
		}
	}
}