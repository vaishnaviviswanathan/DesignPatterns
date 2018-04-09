public class MainApp {

    public static void main(String[] args){

        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);

        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();

        broker.attachOrders(buyStock);
        broker.attachOrders(sellStock);

        broker.executeOrders();



    }
}
