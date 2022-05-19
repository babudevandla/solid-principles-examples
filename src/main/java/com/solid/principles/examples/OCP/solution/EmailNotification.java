package com.solid.principles.examples.OCP.solution;

//EmailNotification implementation

public class EmailNotification implements NotificationService {
	public void sendOTP(String medium) {
		// write Logic using JavaEmail api
	}

	public void sendTransactionNotification(String medium) {
	}
}