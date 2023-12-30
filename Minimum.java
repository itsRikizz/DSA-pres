import java.util.*;
public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        //[5,6,2,9,-2] 
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // int loopMax =0;
            if (min>arr[i]) {
                min=arr[i];
            }
            
        }
        System.out.println(min);
    }
}
