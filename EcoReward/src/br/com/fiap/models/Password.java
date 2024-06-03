package br.com.fiap.models;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password {
    private int id;
    private final int userId;
    private final String hashedPassword;
    private static final String SALT = "my_secret_salt";

    public Password(int userId, String password) {
        this.userId = userId;
        this.hashedPassword = hashPassword(password);
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(SALT.getBytes());
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean validatePassword(String inputPassword) {
        return this.hashedPassword.equals(hashPassword(inputPassword));
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return hashedPassword;
    }

    public int getId() {
        return id;
    }
}
