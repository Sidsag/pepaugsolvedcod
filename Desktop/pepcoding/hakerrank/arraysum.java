import java.io.*;
import java.util.*;

public class arraysum {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
      int t=scn.nextInt();
      int [] arry=new int[t];
        for(int j=0;j<t;j++){
            arry[j]=scn.nextInt();
        }
        sum(arr,arry);
    }
    
    public static void sum(int[] a,int [] b){
      ArrayList<Integer> c=new ArrayList<Integer>();
     int i=a.length-1;
     int j=b.length-1;
     int toadd;
     int carry=0;
     int sum; 
     while(i>=0 && j>=0){
         sum= a[i]+b[j]+carry;
         toadd=sum%10;
         carry=sum/10;
         c.add(toadd);
         i--;
         j--;
     }
     while(i>=0){
         toadd=a[i]+carry;
         c.add(toadd%10);
         carry=toadd/10;
         i--;
     }
     while(j>=0){
         toadd=b[j]+carry;
          c.add(toadd%10);
         carry=toadd/10;
         j--;
     }
    if(carry!=0){
     c.add(carry);
    }
    
    for(int k=c.size()-1;k>=0;k--){
        System.out.print(c.get(k)+" ");
    }
}
} 