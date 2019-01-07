package pattern.iterator.example;

/**
 * Obiettivo: iterare su un oggetto
 * Implementazione:
 * 1) creiamo una interfaccia Iterator che espone i metodi per navigare e una interfaccia Container che ritorna l'oggetto Iterator
 * 2) creiamo la classe NameRepository che implementa l'interfaccia Container, con una classe interna NameIterator che implementa l'interfaccia Iterator
 */
public class IteratorPatternMain {
	
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      } 	
   }
}