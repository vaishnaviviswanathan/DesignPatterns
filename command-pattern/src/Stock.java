public class Stock {

    private String name = "ABC";
    private int quantity = 10;


    public void buyStock(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sellStock(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
