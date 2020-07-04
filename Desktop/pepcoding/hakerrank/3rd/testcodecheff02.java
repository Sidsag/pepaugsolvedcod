import java.util.*;
class testcodecheff02
{
    public static int dayway(int n){
        
        if(n<=0){
            return 0;
        }
        else{
        int[]arr=new int [n];
        int count=1;
        for(int i=0;i<n;i++){
            arr[i]=1;
            count++;
            for(int j=i+1;j<n;j++){
                if(arr[j-1]==0){
                    arr[j]=1;
                    count++;
                }
             }
           for(int k=0;k<n;k++){
               arr[k]=0;
           }
        }
        return count;}
    }
    
	public static void main (String[] args) 
	{
		// yourgoes here
           Scanner scn=new Scanner(System.in);
           int t=scn.nextInt();
           for(int i=0;i<t;i++){
           int s=scn.nextInt();
		  System.out.println(dayway(s));}
	}
}
