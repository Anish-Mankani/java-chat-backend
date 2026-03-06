package org.example.model;

public class Message {

    private User sender;
    private String content;
    private long timeStamp;

    public Message(User sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timeStamp = System.currentTimeMillis();
    }

    public User getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}
