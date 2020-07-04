import java.io.*;
import java.util.*;

public class kadanes{
    public static int kadanesfun(int [] arr){
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>0){
            sum+=arr[i];
            }
            else
            sum=0;
            ans=Math.max(sum,ans);
        }
        if(ans==0){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr.length;j++){
               max=Math.max(max,arr[j]); 
            }
            return max;
        }
        return ans;
        
    }
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int s=0;s<t;s++){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            System.out.println(kadanesfun(arr));
        }
    }
}