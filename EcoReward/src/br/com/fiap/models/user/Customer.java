package br.com.fiap.models.user;

public class Customer extends User {
    private float score;

    public Customer(String name, String email, String password, UserType type, float score) {
        super(name, email, password, type);
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                " score=" + score +
                '}';
    }
}
