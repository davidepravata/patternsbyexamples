package pattern.factorymethod.example;

/**
 * Obiettivo: gestire n animali e i loro versi
 * 1) creiamo l'interfaccia Animal e le classi che la implementano Dog e Cat
 * 2) creiamo la factory AnimalFactory, la quale, a seconda del tipo di animale, richiama la corretta implementazione concreta
 */

public class FactoryMethodMain {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.getAnimal("dog");
        Animal cat = factory.getAnimal("cat");
        System.out.println("Il verso del cane è: " + dog.getCall());
        System.out.println("Il verso del gatto è: " + cat.getCall());

    }
}