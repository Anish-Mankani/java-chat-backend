package org.example.service;

import org.example.model.ChatRoom;
import org.example.model.User;

import java.util.HashMap;

public class ChatService {

    private HashMap<String, ChatRoom> rooms = new HashMap<>();

    public void createRoom(String roomName) {

        if(rooms.containsKey(roomName)) {
            System.out.println("Error: Room " + roomName + " already existed");
            return;
        }
            ChatRoom newRoom = new ChatRoom(roomName);

            rooms.put(roomName, newRoom);

        System.out.println("Room " + roomName + " created successfully.");
    }

    public void joinRoom(String roomName, User user) {


        if (!rooms.containsKey(roomName)) {
            System.out.println("Room " + roomName + " does not exist.");
            return;
        }

            ChatRoom targetRoom = rooms.get(roomName);
            targetRoom.addUser(user);

            System.out.println(user.getName() + " joined room " + roomName);


    }
}

