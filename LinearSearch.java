import java.util.*;
public class LinearSearch {
    public static int SearchK(int[] arr, int target){
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }


        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        //Arr=[5, 4, 7, 2, 6]
        
       int res= SearchK(arr,target);
       if (res!=-1) {
        System.out.println("Target Found at Index"+" "+res);
       } else {
        System.out.println("Target Not Found ");
       }
    }
}
