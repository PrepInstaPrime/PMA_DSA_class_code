// we need getter and setter to access the private variables of a class.
class Student{
    private int num=5;
    private String name="John";
    // getter method: to get the value of private variable
    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    // setter method: to set the value of private variable
    public void setNum(int num){
        this.num=num;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        Student obj = new Student();  
        System.out.println(obj.getNum()); // private variable can not be accessed outside the class.
        System.out.println(obj.getName());
        System.out.println("After setting the value of private variable using setter method.");
        obj.setNum(10); // setting the value of private variable using setter method.
        obj.setName("Tony"); 
        System.out.println(obj.getNum());
        System.out.println(obj.getName());

    }
}
