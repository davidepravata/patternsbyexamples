package pattern.abstractfactory.example;

/**
 * Obiettivo: vogliamo creare oggetti Shape(forme). Passando alla abstract factory la stringa della forma (es. CIRCLE), ne viene creata una istanza, ignorando la relativa classe (pattern.abstractfactory.example.Circle).
 * Implementazione:
 * 1) creiamo l'interfaccia Shape (e Color) e classi concrete che la implementano;
 * 2) creiamo una classe astratta AbstractFactory che restituisca una Shape(o Color) sulla base di una stringa;
 * 3) creiamo una classe ShapeFactory che estenda AbstractFactory e restituisca un oggetto di tipo Shape sulla base di una stringa;
 * 4) creiamo una classe FactoryProducer che restituisca l'istanza di ShapeFactory (o ColorFactory) sulla base di una stringa.
 */
public class AbstractFactoryPatternMain {
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        shape1.draw();

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        shape2.draw();

        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        //call fill method of Red
        color1.fill();

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        color3.fill();

    }
}
