import java.util.*;

public class targetsum {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();}
        int t=scn.nextInt();
        Arrays.sort(arr);
        targetfunction(arr,t);
    }
    
    public static void targetfunction(int [] arr,int target){
        int li=0;
        int ri=arr.length-1;
        while(ri>li){
                int sum=arr[li]+arr[ri];
              if(sum==target){
                    System.out.println(arr[li]+" "+"and"+" "+arr[ri]);
                    li++;
                    ri--;
                }
               else if(sum>target)
               ri--;
               else 
               li++;
            }
        }
}