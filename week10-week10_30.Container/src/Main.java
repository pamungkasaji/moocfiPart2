
import containers.ProductContainer;
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        ProductContainer tv = new ProductContainer("chocolate",10);
        tv.addToTheContainer(5);
        System.out.print(tv);
    }
}
