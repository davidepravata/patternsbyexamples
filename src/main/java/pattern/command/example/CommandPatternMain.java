package pattern.command.example;

/**
 * Obiettivo: gestire le operazioni di acquisto e vendita di un negozio tramite una lista di comandi
 * Implementazione:
 * 1) creiamo una classe Stock che rappresenta una richiesta di vendita o acquisto
 * 2) creiamo una interfaccia Order che agisca da Command, con due implementazioni concrete: BuyStock e SellStock
 * 3) la classe Broker gestisce una lista di Order, per effettuare ordini di acquisto e di vendita
 *
 */
public class CommandPatternMain {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
