package br.com.fiap.models.user;

import br.com.fiap.models.CollectionPoint;

public class Admin extends User {
    private CollectionPoint collectionPoint;

    public Admin(String name, String lastName, String email, String password, UserType type, CollectionPoint collectionPoint) {
        super(name, email, password, type);
        this.collectionPoint = collectionPoint;
    }

    public Admin(String name, String lastName, String email, CollectionPoint collectionPoint) {
        super(name, lastName, email, UserType.ADMIN);
        this.collectionPoint = collectionPoint;
    }

    public CollectionPoint getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(CollectionPoint collectionPoint) {
        this.collectionPoint = collectionPoint;
    }

    public void addCollectionPoint(CollectionPoint collectionPoint) {
        this.collectionPoint = new CollectionPoint("Farol da Barra",
                "Largo do Farol da Barra, S/Nº Forte De Santo Antônio Da Barra, Salvador, Bahia 40140-650");
    }

    public void removeCollectionPoint(CollectionPoint collectionPoint) {
        this.collectionPoint = null;
    }

    public void editCollectionPoint(String name, String address) {
        if (name != null || !name.isEmpty()) {
            this.collectionPoint.setName(name);
        }

        if (address != null || !address.isEmpty()) {
            this.collectionPoint.setAddress(address);
        }
    }
}
