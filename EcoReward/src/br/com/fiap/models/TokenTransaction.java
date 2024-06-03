package br.com.fiap.models;

import java.time.LocalDateTime;

public class TokenTransaction {
    private int id;
    private int userId;
    private int recyclingId;
    private int tokenQuantity;
    private LocalDateTime date;

    public TokenTransaction(int userId, int recyclingId, int tokenQuantity, LocalDateTime date) {
        this.userId = userId;
        this.recyclingId = recyclingId;
        this.tokenQuantity = tokenQuantity;
        this.date = date;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRecyclingId() {
        return recyclingId;
    }

    public void setRecyclingId(int recyclingId) {
        this.recyclingId = recyclingId;
    }

    public int getTokenQuantity() {
        return tokenQuantity;
    }

    public void setTokenQuantity(int tokenQuantity) {
        this.tokenQuantity = tokenQuantity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }
}
