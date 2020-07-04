import java.io.*;
import java.util.*;

public class targetsumtriplet {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();}
        int t=scn.nextInt();
        targetfun(arr,t);
    }
    public static void targetfun(int[] arr,int target){
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
              int sum=arr[i]+arr[j]+arr[k];
               if(sum==target)
                System.out.println(arr[i]+","+" "+arr[j]+" "+"and "+arr[k]);
            }
         }
     } 
    }
 }