public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("hello");
        // str.reverse();
        // str.append(" world");
        // str.insert(2, "test"); // "hetestllo"
        // String str1=str.toString();
        // str1.reverse();  // error can't reverse string
        StringBuilder str2=new StringBuilder("hello");
        String str3="Hello";
        String str4= new String("Hello");
        // if u want to compare string builder then u have to convert
        // them into string then use .equals method. or 
        // compare by iterating 
        System.out.println(str3.equals(str4));
        System.out.println(str2.compareTo(str));  
        // compareTo compares based on ASCII values
        // A=65, B=66, a=97, b=98
        // all methods of builder and buffer are same
    }
}
