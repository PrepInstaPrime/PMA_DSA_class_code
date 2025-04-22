import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        // adding elements
        list.add(4);
        list.add(5);
        list.add(6);
        // updation
        list.set(1,7);
        // insertion
        list.add(1,8);
        // length
        int len=list.size(); //4
        System.out.println("Length of list: "+ len);
        System.out.println("Original list"+list);
        list.remove(1);
        System.out.println("After removal from 1 index: "+ list);
        System.out.println("Element on second index: "+list.get(2));
        // list.clear();
        // System.out.println(list);
         for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
         }
        
    }
}
