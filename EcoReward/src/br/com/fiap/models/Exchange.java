package br.com.fiap.models;

import java.time.LocalDateTime;

public class Exchange {
    private int id;
    private int userId;
    private int benefitId;
    private LocalDateTime date;

    public Exchange(int userId, int benefitId, LocalDateTime date) {
        this.userId = userId;
        this.benefitId = benefitId;
        this.date = date;
    }

    // Getters and Setters
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(int benefitId) {
        this.benefitId = benefitId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }
}
