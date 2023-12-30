import java.util.*;
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        //Arr=[5, 4, 7, 2, 6]
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // int loopMax =0;
            if (max<arr[i]) {
                max=arr[i];
            }
            
        }
        System.out.println(max);
    }
}
