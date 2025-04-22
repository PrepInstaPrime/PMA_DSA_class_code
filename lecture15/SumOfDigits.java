public class SumOfDigits {
    static int digitsum(int num){
        if(num<=0){  // 123<=0 // 12<=0 // 1<=0 // 0<=0
            return 0;
        }
        return num%10+digitsum(num/10);
        // 123%10=3+digitsum(123/10) // 3+3
        // 12%10 =2+ digitsum(12/10) // 2+1
        // 1%10= 1+digitsum(1/10)  // 1+0
    }
    public static void main(String[] args) {
        System.out.println(digitsum(123));  // digitsum(123) // 6
    }
}


// call stack


// digitsum(123)