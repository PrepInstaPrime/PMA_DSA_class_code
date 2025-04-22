public class PublicExample {
    public String name="Public Example";
    public void display(){
        System.out.println("this is coming from publicExample class");
    }
    public static void main(String[] args) {
        PublicExample obj= new PublicExample();
        System.out.println(obj.name);
        obj.display();
    }
}
