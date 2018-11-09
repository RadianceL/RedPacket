package com.example.entity;

public class RedPacket {

    private int id;

    private int packet;

    private double total;

    private double lost;

    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPacket() {
        return packet;
    }

    public void setPacket(int packet) {
        this.packet = packet;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getLost() {
        return lost;
    }

    public void setLost(double lost) {
        this.lost = lost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RedPacket{" +
                "id=" + id +
                ", packet=" + packet +
                ", total=" + total +
                ", lost=" + lost +
                ", description='" + description + '\'' +
                '}';
    }
}
