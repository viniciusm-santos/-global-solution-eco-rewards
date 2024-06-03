package br.com.fiap.models;

import java.time.LocalDateTime;

public class Recycling {
    private int id;
    private int collectionPointId;
    private float weight; // in grams
    private LocalDateTime date;

    public Recycling(int collectionPointId, float weight, LocalDateTime date) {
        this.collectionPointId = collectionPointId;
        this.weight = weight;
        this.date = date;
    }

    public int calculateTokens() {
        return (int) (weight * 10);
    }

    // Getters and Setters
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getCollectionPointId() {
        return collectionPointId;
    }

    public void setCollectionPointId(int pointId) {
        this.collectionPointId = pointId;
    }

    public int getId() {
        return id;
    }
}
