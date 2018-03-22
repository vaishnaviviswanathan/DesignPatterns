public class MainClass {

    public static void main(String args[]){
        Employee CEO = new Employee("Amilia","head employee");

        Employee headMarket =  new Employee("Stiles","head of marketing team");
        Employee headSales =  new Employee("maalavika","head of sales team");

        Employee sales1 = new Employee("slaesEmp1","slaes team 1");
        Employee sales2 = new Employee("slaesEmp2","slaes team 2");

        Employee market1 = new Employee("marketEmp1","market team 1");
        Employee market2 = new Employee("marketEmp2","market team 2");


        headMarket.add(market1);
        headMarket.add(market2);

        headSales.add(sales1);
        headSales.add(sales2);

        CEO.add(headMarket);
        CEO.add(headSales);

        //follows the tree structure
        System.out.println(CEO);
    }

}
