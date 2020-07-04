import java.io.*;
import java.util.*;

public class sumarray{

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
      int t=scn.nextInt();
      int [] arry=new int[t];
        for(int j=0;j<n;j++){
            arr[j]=scn.nextInt();
        }
        sum(arr,arry);
    }
    
    public static void sum(int[] a,int [] b){
        if(a.length>b.length){
        int  bigger[]=a.clone();
        int smaller[]=b.clone();
       }
        
       else{
        int bigger[]=b.clone();
        int smaller []=a.clone();
       }
        int i=bigger.length;
        int j=smaller.length;
        int [] arr=new int[i];
        while(i>=0){
            int carry=0;
            while(j>=0){
                int sum=bigger[j]+smaller[j]+carry;
                int s=sum%10;
                carry=sum/10;
                arr[j]=s;
                j--;
                i--;
            }
            arr[i]=bigger[i]+carry;
            i--;
        }
        for(int k=0;k<bigger.length;k++){
            System.out.println(arr[k]);
        }
}
}