import java.io.*;
import java.util.*;

public class mirrorinverse {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
         reverse(arr);
    }
    
    public static void reverse(int[] arr){
        int[] ary=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=arr[i];
            ary[j]=i;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(ary[k]+" ");
        }
        System.out.println(" ");
        for(int j=0;j<arr.length;){
            if(arr[j]==ary[j])
            j++;
            else 
            System.out.println("false");
            return;
        }
        System.out.println("true");
       
    }
}