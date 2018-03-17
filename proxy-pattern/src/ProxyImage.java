public class ProxyImage implements ImageInterface {

    RealImage realImage;
    String fileName;

    public ProxyImage(String fileName){
        this.fileName=fileName;
    }

    public void display(){
        if(realImage==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
