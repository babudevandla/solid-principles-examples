package com.solid.principles.examples.LSP.problem;

//Liskov substitution Principle (LSP)

/**
 * 
 * This principle states that “Derived or child classes must be substitutable
 * for their base or parent classes”. In other words, if class A is a subtype of
 * class B, then we should be able to replace B with A without interrupting the
 * behavior of the program.
 * 
 * This principle is bit tricky and interesting all it designed based on
 * Inheritance concepts ,so let’s better understand this with an example
 * 
 * Let’s consider I have an abstract class called SocialMedia , who supported
 * all social media activity for user to entertain them like below
 *
 *
 * Social media can have multiple implantation or can have multiple child like
 * Facebook, WhatsApp ,instagram and Twitter etc..
 */
public abstract class SocialMedia {

	public abstract void chatWithFriend();

	public abstract void publishPost(Object post);

	public abstract void sendPhotosAndVideos();

	public abstract void groupVideoCall(String... users);
}

//now let’s assume Facebook want to use this features or functionality .
class Facebook extends SocialMedia {

	public void chatWithFriend() {
		// logic
	}

	public void publishPost(Object post) {
		// logic
	}

	public void sendPhotosAndVideos() {
		// logic
	}

	public void groupVideoCall(String... users) {
		// logic
	}

}

/**
 * In 20th century I believe everyone using this Facebook APP and all the above
 * mention features available in Facebook so here we can consider Facebook is
 * complete substitute of SocialMedia class , both can be replaced without any
 * interrupt .
 * 
 * Now let’s discuss WhatsApp class
 */

class WhatsApp extends SocialMedia {
	public void chatWithFriend() {
		// logic
	}

	public void publishPost(Object post) {
		// Not Applicable
	}

	public void sendPhotosAndVideos() {
		// logic
	}

	public void groupVideoCall(String... users) {
		// logic
	}
}

/**
 * due to publishPost() method whatsapp child is not substitute of parents
 * SocialMedia
 * 
 * because whatsapp doesn’t support upload photos and videos for friend it’s
 * just a chatting application so it doesn’t follow LSP
 * 
 * Similarly instagram doesn’t support groupVideoCall() feature so we say
 * instagram child is not substitute of parents SocialMedia
 * 
 * How to overcome this issue so that my code can follow LSP
 */