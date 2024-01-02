import java.util.Scanner;

public class MoveNegative {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
          arr[i]=sc.nextInt();
        }
        int left = 0;
        int right =n-1;
        while (left<right) {
            while (arr[left]<0) {
                left++;
            }
            while (arr[right]>0) {
                right--;
            }

            if(left>=right){
                break;
            }

            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]= temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       
    }
}
