/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.simple.app;

public class App {
	public String getGreeting(int i) {
		return "Hello World! " + i;
	}

	public static void main(String[] args) {
		App app = new App();
		for (int i = 0; i < 100; i++) {
			System.out.println(app.getGreeting(i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}
