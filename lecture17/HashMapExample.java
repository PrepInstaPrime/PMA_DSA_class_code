import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Poorna");
        map.put("age","18");
        System.out.println(map);
        // access value by get method
        String name=map.get("name1");
        System.out.println(name);
        // get or default
        String age= map.getOrDefault("age1", "Not available");
        System.out.println(age);
        map.remove("age");
        System.out.println(map);
        // update
        map.put("age","20");
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        
    }
}
