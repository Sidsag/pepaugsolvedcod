import java.util.*;

public class arrmax {

    public static void main(String[] args) {
      Scanner scn =new Scanner(System.in);
      int n=scn.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<arr.length;i++){
         arr[i]=scn.nextInt();
      }
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println(" ");
      System.out.println(max(arr));
    }
    
    public static int max(int [] array){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
         if(array[i]>maximum)
             maximum=array[i];
      }
        return maximum;
    }
    
}