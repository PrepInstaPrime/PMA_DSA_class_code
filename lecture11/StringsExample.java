import java.util.Arrays;

public class StringsExample {
    public static void main(String[] args) {
        String str="Hello";
        String str1=str.toUpperCase();
        String str2= str.toLowerCase();
        String str3=str1.concat(str2);// HELLOhello
        String str4= str.repeat(3);
        int len= str.length();
        boolean check= str.contains("He");
        String intro="My name is IDK , I am software Engineer at Microsoft";
        String arr[]=intro.split(",");
        char carr[]=str.toCharArray();
        String str6= str.substring(1,4);
        String str7= str.substring(3);
        // String str5= str.reverse();  // this is not possible because of immutable 
        //nature of strings 
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(len);
        System.out.println(check);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(carr));
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        System.out.println(str6);
        System.out.println(str7);
    }
}
