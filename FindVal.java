import java.util.*;

public class FindVal {
    public static int findK(int[] arr, int k){
      
      for(int i =0;i<arr.length;i++){
        if(arr[i]==k){
          return i;
        }
      }
      return -1;
      
    }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int number[] = new int[n];
      
      // System.out.println("Intput");
      
      for(int i=0;i<n;i++){
        number[i]= sc.nextInt();
      }
      
      // System.out.println("Output");
      
      // for(int i=0;i<n;i++){
      //   System.out.print(number[i]+"");
      // }
     int result =  findK(number,7);
    System.out.println("7 is at index "+ result);
  }
}