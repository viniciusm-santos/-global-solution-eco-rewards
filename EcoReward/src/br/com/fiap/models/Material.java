package br.com.fiap.models;

public abstract class Material {
    private int id;
    private String name;
    private String description;
    private double tax;

    public Material() {
    }

    public Material(int id, String name, String description, double tax) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tax=" + tax +
                '}';
    }
}
