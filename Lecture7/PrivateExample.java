class privateExample2{
    private String address="MP";
    public int rollno= 15;
}
public class PrivateExample {
    private String name="Priyam";
    public int age=19;
    public static void main(String[] args) {
        PrivateExample obj= new PrivateExample();
        privateExample2 obj1= new privateExample2();
        System.out.println(obj1.address);
        System.out.println(obj1.rollno);
        // System.out.println(obj.name);
        // System.out.println(obj.age);
    }
}
