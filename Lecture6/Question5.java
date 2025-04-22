//write a program which takes input of elements as string in an array and also search word. Print the index of that word in the string array. 
// [“hello”,”world”,”java”,”python”,”c”] search word: java 
// output: 2
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        // String str1="hello";
        // String str2=new String("hello");
        // // String str2="hello";
        // System.out.println(str1+ "  "+str2);
        // if(str1.equals(str2)){
        //     System.out.println("Same");
        // }
        // else{
        //     System.out.println("Different");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        System.out.println("Enter the word to search: ");
        String search = sc.next();
        for(int i=0;i<n;i++){
            if(arr[i].equals(search)){
                System.out.println(i);
                break;
            }
        }

    }
}

// home work questions
// 1. Write a java program which takes input of elements as string in an array and also search word. Print the index of that word in the string array. and also check if that word is palindrome or not.
//2. write a java program which takes array as input and prints the maximum sum of subarray of size k.
// example: [1,2,3,4,5,6,7,8,9] k=3
// output: 24