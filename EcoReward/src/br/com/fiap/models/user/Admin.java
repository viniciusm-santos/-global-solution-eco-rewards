package br.com.fiap.models.user;

import br.com.fiap.models.CollectionPoint;

public class Admin extends User {
    private CollectionPoint collectionPoint;

    public Admin(String name, String email, String password, UserType type, CollectionPoint collectionPoint) {
        super(name, email, password, type);
        this.collectionPoint = collectionPoint;
    }

    public CollectionPoint getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(CollectionPoint collectionPoint) {
        this.collectionPoint = collectionPoint;
    }
}