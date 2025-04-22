import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(1));

    }
}
