public class StringLec {
    public static void main(String[] args) {
        String name="Yogant";
        // System.out.println(name);
        // System.out.println(name.length());
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));
        // }
        for(int i=0;i<name.length();i++){
            if(i%2==1){
                System.out.println(name.charAt(i));
            }
        }
    }
}
