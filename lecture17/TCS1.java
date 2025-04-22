/*
 * A meteorological department is tracking the highest recorded temperatures across different cities. To analyze global warming trends, they need to determine the maximum temperature from a given dataset.
Write a program that finds the highest temperature recorded in a given list.
Input:
First line contains an integer N (1 ≤ N ≤ 1000), the number of cities.
Second line contains N space-separated integers representing temperatures (−100 ≤ temp ≤ 100).
Output:
Print the highest temperature recorded.
Example:
Input:  
4  
-5 23 19 30  

Output:  
30

 */
import java.util.*;
public class TCS1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        short n=sc.nextShort();
        ArrayList<Byte> list= new ArrayList<>();
        for(short i=0;i<n;i++){
            list.add(i,sc.nextByte());
        }
        byte max=-100;
        for(short i=0;i<n;i++ ){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}
