package com.solid.principles.examples.OCP.solution;

//Mobile Notification implementation

public class MobileNotification implements NotificationService {
	public void sendOTP(String medium) {
		// write Logic using Twilio SMS API
	}

	public void sendTransactionNotification(String medium) {
	}
}