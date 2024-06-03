package br.com.fiap.models;

public class User {
    private int id;
    private String name;
    private String email;
    private int totalBalance;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.totalBalance = 0;
    }

    public void addTokens(int tokens) {
        this.totalBalance += tokens;
    }

    public void deductTokens(int tokens) {
        if (this.totalBalance >= tokens) {
            this.totalBalance -= tokens;
        } else {
            throw new IllegalArgumentException("Not enough tokens");
        }
    }

    public void exchangeTokensForBenefit(Benefit benefit) {
        if (this.totalBalance >= benefit.getTokenValue()) {
            this.deductTokens(benefit.getTokenValue());
        } else {
            throw new IllegalArgumentException("Not enough tokens to exchange for this benefit");
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalBalance() {
        return totalBalance;
    }

    public int getId() {
        return id;
    }
}
