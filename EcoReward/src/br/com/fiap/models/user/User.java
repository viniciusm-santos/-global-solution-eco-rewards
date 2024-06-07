package br.com.fiap.models.user;

public class User {
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private UserType type;

    public User() {
    }

    public User(String name, String lastName, String email, UserType type) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.type = type;
    }

    public User(String name, String lastName, String email, String password, UserType type) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public int getId() {
        return id;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}
