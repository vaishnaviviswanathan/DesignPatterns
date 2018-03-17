public class MainClass {

    public static void main(String args[]){
        ProxyImage proxy = new ProxyImage("fileNAme");

        //loads file from the disk
        proxy.display();

        //does not load file from the disk since it has already been fetched
        proxy.display();

    }
}
