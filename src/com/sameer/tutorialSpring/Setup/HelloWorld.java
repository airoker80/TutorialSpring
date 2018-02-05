package com.sameer.tutorialSpring.Setup;

/**
 * Created by Sameer on 2/5/2018.
 */
public class HelloWorld {
    String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public HelloWorld() {
    }

    public void getMessage() {
        System.out.println("Your Message " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
