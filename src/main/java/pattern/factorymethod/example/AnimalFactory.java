package pattern.factorymethod.example;

public class AnimalFactory {
    public AnimalFactory(){}
    public Animal getAnimal (String type){
        Animal retval = null;

        if(type.equals("dog")) {
            retval = new Dog();
        } else if(type.equals("cat")) {
            retval = new Cat();
        }

        return retval;
    }
}