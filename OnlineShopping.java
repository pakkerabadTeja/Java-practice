package com.javapractice;

class OnlineShopping {

	private boolean orderConfirmed = false;

	// Synchronized method to confirm the order
	public synchronized void confirmOrder() {
		// Simulate order confirmation process
		System.out.println(Thread.currentThread().getName() + " confirming order...");
		orderConfirmed = true;
		notify(); // Notify any waiting thread that the order is confirmed
	}

	// Synchronized method to complete the payment
	public synchronized void completePayment() {
		// Wait until the order is confirmed
		while (!orderConfirmed) {
			try {
				wait(); // Wait until notified by confirmOrder method
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Thread interrupted");
			}
		}

		// Simulate payment completion process
		System.out.println(Thread.currentThread().getName() + " completing payment...");
		System.out.println("Payment completed. Order confirmed.");
	}
}

class ConfirmOrderRunnable implements Runnable {

	private final OnlineShopping shopping;

	public ConfirmOrderRunnable(OnlineShopping shopping) {
		this.shopping = shopping;
	}

	@Override
	public void run() {
		shopping.confirmOrder();
	}
}

class CompletePaymentRunnable implements Runnable {

	private final OnlineShopping shopping;

	public CompletePaymentRunnable(OnlineShopping shopping) {
		this.shopping = shopping;
	}

	@Override
	public void run() {
		shopping.completePayment();
	}
}

public class OnlineShoppingApp {

	public static void main(String[] args) {
		OnlineShopping shopping = new OnlineShopping();

		// Create thread to confirm the order
		Thread confirmOrderThread = new Thread(new ConfirmOrderRunnable(shopping));
		confirmOrderThread.setName("ConfirmOrderThread");

		// Create thread to complete the payment
		Thread completePaymentThread = new Thread(new CompletePaymentRunnable(shopping));
		completePaymentThread.setName("CompletePaymentThread");

		// Start both threads
		completePaymentThread.start(); // Start payment thread first to demonstrate waiting
		confirmOrderThread.start();
	}
}
//Output--->
ConfirmOrderThread confirming order...
CompletePaymentThread completing payment...
Payment completed. Order confirmed.