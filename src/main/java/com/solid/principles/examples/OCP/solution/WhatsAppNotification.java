package com.solid.principles.examples.OCP.solution;


//similarly you can add implementation for WhatsApp notification service

public class WhatsAppNotification implements NotificationService {
	public void sendOTP(String medium) {
		// write Logic using whatsapp API
	}

	public void sendTransactionNotification(String medium) {
	}
}