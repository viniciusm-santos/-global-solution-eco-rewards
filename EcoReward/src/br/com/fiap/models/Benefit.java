package br.com.fiap.models;

public class Benefit {
    private int id;
    private String name;
    private String description;
    private int tokenValue;

    public Benefit(String name, String description, int tokenValue) {
        this.name = name;
        this.description = description;
        this.tokenValue = tokenValue;
    }

    // Getters and Setters
    public int getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(int tokenValue) {
        this.tokenValue = tokenValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
