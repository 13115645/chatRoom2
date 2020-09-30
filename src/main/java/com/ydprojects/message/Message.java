package main.java.com.ydprojects.message;

import main.java.com.ydprojects.utils.MessageEncryption;

import java.io.Serializable;

public class Message implements Serializable {

    private String message;

    public Message(String message) {
        this.message = MessageEncryption.encrypt(message);
    }

    public String getMessage() {
        return message;
    }
}
