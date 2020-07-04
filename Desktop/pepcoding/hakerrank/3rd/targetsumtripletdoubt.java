
import java.util.*;
public class targetsumtripletdoubt{
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();}
        int t=scn.nextInt();
        Arrays.sort(arr);
        targetfun(arr,t);
    }
    
    public static void targetfun(int[] arr,int target){
        int li=0;
        int ri=arr.length-1;
        while(li<ri){
            int mi=li+1;
            for(;mi<ri && mi!=-1;){
            int sum=arr[li]+arr[mi]+arr[ri];
            if(sum==target){
                System.out.println(arr[li]+","+" "+arr[mi]+" "+"and "+arr[ri]);
                ri--;
                mi=-1;}
            else if(sum>target){
                ri--;
                mi=-1;
            }
            else 
            mi++;
            }
            if(mi!=-1)
            li++;
        }        
    }
    }