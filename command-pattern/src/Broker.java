import java.util.ArrayList;


public class Broker {

    ArrayList<Order> orders = new ArrayList<>();

    public void attachOrders(Order order){
        orders.add(order);
    }

    public void executeOrders(){


        for(Order order: orders){
            order.execute();
        }
        orders.clear();
    }

}
