package com.solid.principles.examples.OCP.problem;

//Open closed Principle (OSP)

/**
 * 
 * This principle states that “software entities (classes, modules, functions,
 * etc.) should be open for extension, but closed for modification” which means
 * you should be able to extend a class behavior, without modifying it.
 * 
 * let’s understand this principle with an example .let’s consider the same
 * Notification service which we just created .
 * 
 * Here as discussed earlier if you want to introduced send OTP via mobile Phone
 * or WhatsApp number then you need to modify source code in Notification
 * Service right ?
 * 
 * Here What OCP says , It open for Extension but close for modification hence
 * its not recommended to modify Notification Service for each OTP Feature , it
 * will violate OCP
 * 
 * So to overcome this you need to design your code in such a way that everyone
 * can reuse your feature by just extending it and if they need any
 * customization they can extend it and add their feature on top of it like a
 * abstraction .
 *
 */

public class NotificationService {
	public void sendOTP(String medium) {
		if (medium.equals("email")) {
			// write email related logic
			// use JavaMailSenderAPI
		}
	}
}