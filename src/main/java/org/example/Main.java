package org.example;

import org.example.model.User;
import org.example.service.ChatService;

public class Main {
    public static void main(String[] args) {

        ChatService service = new ChatService();

        User u1 = new User(1, "Anish");
        User u2 = new User(2, "Ali");

        service.createRoom("general");

        service.joinRoom("general", u1);
        service.joinRoom("general", u2);

        service.sendMessage("general", u1, "Hello");
        service.sendMessage("general", u2, "Hi bro");

    }
}