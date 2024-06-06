package br.com.fiap.models.user;

import br.com.fiap.models.Benefit;

public class Customer extends User {
    private float score;
    private float goal;

    public Customer(String name, String lastName, String email, float score, float goal) {
        super(name, lastName, email, UserType.CUSTOMER);
        this.score = score;
        this.goal = goal;

    }

    public Customer(String name, String lastName, String email, String password, UserType type, float score, float goal) {
        super(name, lastName, email, password, type);
        this.score = score;
        this.goal = goal;

    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getGoal() {
        return goal;
    }

    public void setGoal(float goal) {
        this.goal = goal;
    }

    public void addTokens(int tokens) {
        this.score += tokens;
    }

    public void deductTokens(int tokens) {
        if (this.score >= tokens) {
            this.score -= tokens;
        } else {
            throw new IllegalArgumentException("Not enough tokens");
        }
    }

    public void exchangeTokensForBenefit(Benefit benefit) {
        if (this.score >= benefit.getTokenValue()) {
            this.deductTokens(benefit.getTokenValue());
        } else {
            throw new IllegalArgumentException("Not enough tokens to exchange for this benefit");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                " score=" + score +
                " goal=" + goal +
                '}';
    }
}
