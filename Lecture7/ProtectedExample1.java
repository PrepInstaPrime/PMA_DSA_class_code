package pack2;
import pack1.ProtectedExample;
// we can access properties with protected keyword outside the packages but only when we create subclass of it. 
public class ProtectedExample1 extends ProtectedExample{
    public int age=18;
    protected String name="Akshay";
    public static void main(String[] args) {
        ProtectedExample1 obj= new ProtectedExample1();
        // ProtectedExample obj1= new ProtectedExample();
        System.out.println(obj.address); // address is not accessible
        System.out.println(obj.num);
        // System.out.println(obj.age);
        // System.out.println(obj.name);
    }
}

// differnce between public and protected is public is accessible everywhere while protected is only accessible within the same class