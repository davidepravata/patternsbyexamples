package pattern.facade.example;

/**
 * Obiettivo: disegnare forme nascondendo le diverse classi concrete al cliente
 * Implementazione:
 * 1) creiamo una interfaccia Shape e classi concrete che la implementano (Circle, Rectangle, Square)
 * 2) la classe Facade ShapeMaker usa le classi concrete per delegare le chiamate dell'utente alle classi concrete Rectangle, Circle e Square
 *
 */
public class FacadePatternMain {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();
   }
}