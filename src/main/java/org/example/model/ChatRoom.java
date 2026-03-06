package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private String roomName;
    private ArrayList<User> users;
    private ArrayList<Message> messages;
    private static final int MESSAGE_LIMIT = 50;

    public ChatRoom(String roomName) {
        this.roomName = roomName;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public List<Message> getMessages() {
        return new ArrayList<>(messages);
    }

    public void addMessage(Message message) {
        this.messages.add(message);

        if (messages.size()> MESSAGE_LIMIT){
            messages.remove(0);
        }
    }

    public void addUser(User user) {
        users.add(user);
    }
}
