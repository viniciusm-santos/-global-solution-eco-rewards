package br.com.fiap.models;

import java.time.LocalDateTime;

public class Recycling {
    private int id;
    private CollectionPoint collectionPoint;
    private Material material;
    private float weight; // in grams
    private LocalDateTime date;

    public Recycling(CollectionPoint collectionPoint, Material material, float weight, LocalDateTime date) {
        this.collectionPoint = collectionPoint;
        this.material = material;
        this.weight = weight;
        this.date = date;
    }

    public int calculateTokens() {
        return (int) (weight * material.getTax());
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

    public CollectionPoint getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPointI(CollectionPoint collectionPoint) {
        this.collectionPoint = collectionPoint;
    }

    public int getId() {
        return id;
    }
}
