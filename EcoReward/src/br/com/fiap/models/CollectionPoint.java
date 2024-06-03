package br.com.fiap.models;

public class CollectionPoint {
    private int id;
    private String name;
    private String address;

    public CollectionPoint(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
