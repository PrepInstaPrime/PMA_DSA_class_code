import java.util.Arrays;
public class Anagram {
    static boolean check(String str1, String str2){
        char arr1[]= str1.toCharArray(); // O(n)
        char arr2[]= str2.toCharArray(); // O(n)
        Arrays.sort(arr1); // o(nlogn)
        Arrays.sort(arr2);
        // return Arrays.toString(arr1).equals(Arrays.toString(arr2));
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        String str="care";
        String str1="race";
        // write a program to check whether two strings are equal or not.
        System.out.println(check(str, str1));
    }
}

// write a program to check whether both the strings are palindrome or not. 
