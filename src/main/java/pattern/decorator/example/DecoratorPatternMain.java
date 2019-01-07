package pattern.decorator.example;

/**
 * Obiettivo: vogliamo realizzare forme (Shape) e decorarne i bordi
 * Implementazione:
 * 1) creiamo l'interfaccia Shape e le sue implementazioni concrete (Circle, Rectangle)
 * 2) creiamo una classe astratta Decorator chiamata ShapeDecorator che implementa l'interfaccia Shape ed usa l'oggetto Shape come variabile
 * 3) creiamo classi concrete (RedShapeDecorator) che implementano ShapeDecorator
 *
 */

public class DecoratorPatternMain {
   public static void main(String[] args) {

      Shape circle = new Circle();
      System.out.println("Circle with normal border");
      circle.draw();

      Shape redCircle = new RedShapeDecorator(new Circle());
      System.out.println("Circle of red border");
      redCircle.draw();

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Rectangle of red border");
      redRectangle.draw();
   }
}