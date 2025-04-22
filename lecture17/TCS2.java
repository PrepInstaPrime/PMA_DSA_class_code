/*
 * Question 7: 
A movie streaming platform wants to analyze user preferences by counting how many times each movie was watched in a week. Write a program that takes an array of movie IDs and counts the frequency of each movie watched.
Input:
First line contains an integer N (1 ≤ N ≤ 1000), the number of watch records.
Second line contains N space-separated integers, each representing a movie ID.
Output:
Print each movie ID along with its count, sorted in ascending order of movie ID.
Example:
Input:  
7  
101 102 101 103 101 102 104  

Output:  
101 3  
102 2  
103 1  
104 1

 */
import java.util.Scanner;
import java.util.HashMap;
public class TCS2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        short n= sc.nextShort();
        int movie[]= new int[n];
        for(short i=0;i<n;i++){
            movie[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> map= new HashMap<>();
        for(short i=0;i<n;i++){
            if(map.getOrDefault(movie[i],0)==0){
                map.put(movie[i], 1);
            }else{
                map.put(movie[i],map.get(movie[i])+1);
            }
        }
        // System.out.println(map);
        for(int key: map.keySet()){
            System.out.println(key +" "+map.get(key));
        }
        
    }
}
