package services;

import interfaces.CorporateEntity;
import interfaces.Individual;

public class EntityService {

    public static void corporate() {

        System.out.println("***(CREATING A NEW CORPORATE ENTITY****)");

        CorporateEntity corporateEntity = new CorporateEntity();

        corporateEntity.setName("Kraquen");
        corporateEntity.setLastName("Design");
        corporateEntity.setCnpj("123.456.789/0001-00");

        System.out.println(corporateEntity.getName() + " " + corporateEntity.getLastName() + " / CPNJ - " + corporateEntity.getCnpj());
        System.out.println();
    }

    public static void person() {

        System.out.println("***(CREATING A NEW INDIVIDUAL****)");

        Individual individual = new Individual();

        individual.setName("Igor");
        individual.setLastName("Gasparin");
        individual.setCpf("123.456.789-00");

        System.out.println(individual.getName() + " " + individual.getLastName() + " / CPF - " + individual.getCpf());
        System.out.println();
    }
}
