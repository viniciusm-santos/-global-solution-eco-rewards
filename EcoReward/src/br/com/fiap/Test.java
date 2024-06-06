package br.com.fiap;

import br.com.fiap.models.Benefit;
import br.com.fiap.models.CollectionPoint;
import br.com.fiap.models.Material;
import br.com.fiap.models.Recycling;
import br.com.fiap.models.user.Admin;
import br.com.fiap.models.user.Customer;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        CollectionPoint collectionPoint = new CollectionPoint("Farol da Barra",
                "Largo do Farol da Barra, S/Nº Forte De Santo Antônio Da Barra, Salvador, Bahia 40140-650");

        Admin admin = new Admin("Jorge", "Carlos", "jorge.carlos@email.com", collectionPoint);

        Customer customer = new Customer("David", "Leo", "david.leo@email.com", 0, 0);

        Benefit internet = new Benefit("5GB internet", "5GB de internet móvel para usar como quiser", 2500);

        Material glass = new Material("Vidro", "Todos os tipos de vidro", 25);

        Recycling recycling = new Recycling(collectionPoint, glass, 30, LocalDateTime.now());
    }

}
