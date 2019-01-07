package pattern;

import pattern.abstractfactory.example.AbstractFactoryPatternMain;
import pattern.adapter.example.AdapterPatternMain;

public class PatternMain {
    public static void main(String[] args) {

        System.out.println("START ABSTRACT FACTORY PATTERN EXAMPLE:");
        // https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
        new AbstractFactoryPatternMain().main(null);
        System.out.println("________________________");

        System.out.println("START ADAPTER PATTERN EXAMPLE:");
        //https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
        new AdapterPatternMain().main(null);
        System.out.println("________________________");

    }

}
