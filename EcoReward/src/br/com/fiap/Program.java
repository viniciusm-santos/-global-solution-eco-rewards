package br.com.fiap;

import br.com.fiap.models.*;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        // Create a user
        User user = new User("John Doe", "john.doe@example.com");
        System.out.println("-----User created-----\nName: " + user.getName() + "\nEmail: " + user.getEmail());

        // Create user's password
        Password password = new Password(user.getId(), "my_secure_password");
        System.out.println("-----Password created-----\nPassword(hashed): " + password.getPassword());

        // Validate password
        if (password.validatePassword("my_secure_password")) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid password.");
        }

        // Create a collection point
        CollectionPoint point = new CollectionPoint("Beach Cleanup", "123 Ocean Ave");
        System.out.println("-----Collection Point created-----\nName: " + point.getName() + "\nAddress: " + point.getAddress());

        // Register a recycle
        Recycling recycling = new Recycling(point.getId(), 5.0f, LocalDateTime.now());
        System.out.println("-----Recycling created-----\nWeight: " + recycling.getWeight() + "\nRecycling date: " + recycling.getDate());

        int tokensEarned = recycling.calculateTokens();
        System.out.println("-----Tokens earned-----\nValue: " + recycling.calculateTokens());


        // Register a token transaction
        TokenTransaction transaction = new TokenTransaction(user.getId(), recycling.getId(), tokensEarned, LocalDateTime.now());
        System.out.println("-----Transaction created-----\nTransaction date: " + transaction.getDate() + "\nToken quantity: " + transaction.getTokenQuantity());

        // Add token to user's balance
        user.addTokens(tokensEarned);

        // Create a benefit
        Benefit benefit = new Benefit("Discount at Kiosk", "10% off on all items", 30);
        System.out.println("-----Benefit created-----\nName: " + benefit.getName() + "\nDescription: " + benefit.getDescription() + "\nToken cost: " + benefit.getTokenValue());

        // Exchange tokens for a benefit
        try {
            user.exchangeTokensForBenefit(benefit);
            // Register a exchange for a benefit
            Exchange exchange = new Exchange(user.getId(), benefit.getId(), LocalDateTime.now());
            System.out.println("-----Exchange created-----\nDate: " + exchange.getDate());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Final user's total balance
        System.out.println("-----Final token balance-----\nValue: " + user.getTotalBalance());
    }
}

