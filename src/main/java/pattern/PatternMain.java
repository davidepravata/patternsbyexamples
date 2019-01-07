package pattern;

import pattern.abstractfactory.example.AbstractFactoryPatternMain;
import pattern.adapter.example.AdapterPatternMain;
import pattern.command.example.CommandPatternMain;
import pattern.composite.example.CompositePatternMain;
import pattern.decorator.example.DecoratorPatternMain;
import pattern.facade.example.FacadePatternMain;
import pattern.factorymethod.example.FactoryMethodPatternMain;
import pattern.iterator.example.IteratorPatternMain;
import pattern.observer.example.ObserverPatternMain;

public class PatternMain {
    public static void main(String[] args) {

        System.out.println("START ABSTRACT FACTORY PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
        new AbstractFactoryPatternMain().main(null);
        System.out.println("________________________");

        System.out.println("START ADAPTER PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
        new AdapterPatternMain().main(null);
        System.out.println("________________________");

        System.out.println("COMMAND PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/command_pattern.htm
        new CommandPatternMain().main(null);
        System.out.println("________________________");

        System.out.println("COMPOSITE PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/composite_pattern.htm
        new CompositePatternMain().main(null);
        System.out.println("________________________");

        System.out.println("DECORATOR PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
        new DecoratorPatternMain().main(null);
        System.out.println("________________________");

        System.out.println("FACADE PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
        new FacadePatternMain().main(null);
        System.out.println("________________________");

        System.out.println("FACTORY METHOD PATTERN EXAMPLE:");
        // https://italiancoders.it/factory-method-design-pattern/
        new FactoryMethodPatternMain().main(null);
        System.out.println("________________________");

        System.out.println("ITERATOR PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
        new IteratorPatternMain().main(null);
        System.out.println("________________________");

        System.out.println("OBSERVER PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
        new ObserverPatternMain().main(null);
        System.out.println("________________________");
    }

}
