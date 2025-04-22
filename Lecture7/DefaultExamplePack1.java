package pack1;
class DefaultExample{
    int paisa=2000;
}
public class DefaultExamplePack1 {
    int money=1000;
    public static void main(String[] args) {
        DefaultExamplePack1 obj = new DefaultExamplePack1();
        DefaultExample obj1= new DefaultExample();
        System.out.println(obj.money);
        System.out.println(obj1.paisa);
    }
}
