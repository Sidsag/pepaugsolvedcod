import java.io.*;
import java.util.*;

public class waveprintrc{
    public static void waveprint(int [][] arr){
        Boolean flag=true;
        for(int i=0;i<arr.length;i++){
            int k=arr[i].length-1;
            for(int j=0;j<arr[0].length;j++){
                if(flag){
                if(arr[i][j]!=0)
                System.out.print(arr[i][j]+" ");
                 }
                else{
                if(arr[i][j+k]!=0){
               System.out.print(arr[i][j+k]+" ");
                k-=2;}
                }
                }
            flag=!flag;
        } 
        flag=true;
        System.out.println("");
        for(int j=0;j<arr[0].length;j++){
              int k=arr.length-1;
              for(int i=0;i<arr.length;i++){
               if(flag){
                 if(arr[i][j]!=0){
                 System.out.print(arr[i][j]+" ");
                 }
               } 
                else{
                 if(arr[i+k][j]!=0){
                 System.out.print(arr[i+k][j]+" ");
                 k-=2;}
                }
            }
            flag=!flag;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int m=scn.nextInt();
      int n=scn.nextInt();
      int[][] arr=new int[m][n];
      for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr[0].length;j++){
           arr[i][j]=scn.nextInt();
         }
      }
     waveprint(arr);
    }
}