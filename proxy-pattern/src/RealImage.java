public class RealImage implements ImageInterface {

    String fileName;

    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDisk();
    }

    public void display(){
        System.out.println("the filename is:"+fileName);
    }

    public void loadFromDisk(){
        System.out.println("loading ... "+fileName);
    }
}
