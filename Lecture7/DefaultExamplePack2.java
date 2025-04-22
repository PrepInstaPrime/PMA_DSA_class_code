package pack2;
import pack1.DefaultExamplePack1;
public class DefaultExamplePack2 /*extends DefaultExamplePack1*/{
    public static void main(String[] args) {
        DefaultExamplePack1 obj= new DefaultExamplePack1();
        System.out.println(obj.money);  // default not accessible outside the package
    }
}
