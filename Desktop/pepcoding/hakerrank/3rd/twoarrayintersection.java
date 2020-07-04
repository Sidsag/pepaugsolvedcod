import java.io.*;
import java.util.*;

public class twoarrayintersection{
    

    public static void main(String [] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
         int m=scn.nextInt();
        int[] ary=new int[m];
        for(int i=0;i<n;i++){
            ary[i]=scn.nextInt();
        }
        intersection(arr,ary);
    }
    
    public static void intersection(int[] a,int[] b){
        ArrayList<Integer> c=new ArrayList<Integer>();
        int j=0;
        int i=0;
        Arrays.sort(a); 
        Arrays.sort(b); 
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                c.add(a[i]);
                i++;
                j++;
             }
            else if(a[i]<b[j]){
                i++;
            }
            else 
                j++;
        }
        if(c.size()<=0){
          //element not found;}
        }
        else{
        System.out.print("[");
        System.out.print(c.get(0));
        for(int k=1;k<c.size();k++){
            System.out.print(", "+c.get(k));
        }
         System.out.print("]"); }  
    }
}