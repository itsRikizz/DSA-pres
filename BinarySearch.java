import java.util.Scanner;

public class BinarySearch {
    public static int SearchK(int[] arr, int target){
        int n = arr.length;
        int li = 0;
        int ri =n-1;
        while (li<=ri) {
            int mid =  li + (ri - li) / 2;
            if (target==arr[mid]) {
                return mid;
            }
            if (target<arr[mid]) {
                ri =mid-1;
            }else{
                li=mid+1;
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
        //Arr=[5, 4, 7, 2, 6]
        //Arr=[5, 4, 7, 2, 6]
        
       int res= SearchK(arr,target);
       if (res!=-1) {
        System.out.println("Target Found at Index"+" "+res);
       } else {
        System.out.println("Target Not Found ");
       }
    }
}
