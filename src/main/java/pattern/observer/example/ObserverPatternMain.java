package pattern.observer.example;

/**
 * Obiettivo: vogliamo tenere traccia dei cambiamenti su un oggetto Subject tramite tre Observer
 * Implementazione:
 * 1) creiamo la classe Subject, al cui interno definiamo una lista Observer
 * 2) Observer è una classe astratta
 * 3) creiamo le n classi concrete che estendono Observer e che verranno notificate al cambiamento dello stato di Subject
 */
public class ObserverPatternMain {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}