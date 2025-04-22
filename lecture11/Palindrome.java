public class Palindrome {
    static boolean check(String str1, String str2){
        StringBuffer str3=new StringBuffer(str1);
        str3.reverse();
        String str4= str3.toString();
        return  str4.equals(str2);
    }
    public static void main(String[] args) {
        String str1="racecar";
        String str2="racecar1";
        System.out.println(check(str1, str2));


    }
}
