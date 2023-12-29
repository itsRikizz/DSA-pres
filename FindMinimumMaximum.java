import java.util.*;

public class FindMinimumMaximum {
    public static void findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max is : "+ max);
    }
    public static void findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Min is : "+ min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array input");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        findMin(arr);
        findMax(arr);
    }
}
