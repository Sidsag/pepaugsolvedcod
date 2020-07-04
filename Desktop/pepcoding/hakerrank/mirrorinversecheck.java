import java.io.*;
import java.util.*;

public class mirrorinversecheck{

    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int[] arry=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            arry[j]=scn.nextInt();
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
        System.out.println(" ");
        for(int l=0;l<arr.length;l++){
            System.out.print(arry[l]);
        }
        System.out.println(" ");
         reverse(arr,arry);
    }
    
    public static void reverse(int[] arr,int[]arry){
        int[] ary=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=arr[i];
            ary[j]=i;
        }
        for(int j=0;j<arr.length;){
            
            if(arry[j]==ary[j]){
            j++;}
           else { 
            System.out.println("false");
            return;}
        }
        System.out.println("true");
       
    }
    }
