package com.machinecoding.model;
import java.util.UUID;

public class Player {

    public String name;
    public String id;
    public int currentPosition;

    public Player(String name) {
        this.name = name;
        this.currentPosition = 0;
        id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
