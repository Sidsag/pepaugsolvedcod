import java.util.*;

class testcodecheff03{
    public static int costfinder(int [][] arr){
        int[] cost=new int[arr.length+1];
        int total_cost=0;
        for(int i=0;i<arr.length;i++){
            int min_cost=Integer.MAX_VALUE;
            for(int j=0;j<arr[0].length;j++){
                 if(arr[i][j] < min_cost && cost[i]!=j+1){
                     min_cost=arr[i][j];
                     cost[i+1]=j+1;
                 }
            }
            total_cost+=min_cost;
        }
        return total_cost;
    }

    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number of houses: ");
        int n=scn.nextInt();
        int[][] ary=new int[n][3];
        for(int k=0;k<ary.length;k++){
            System.out.println("enter the cost of paint of house"+k+"in Pink ,Orange and yellow respectively");
            for(int s=0;s<ary[0].length;s++){
                ary[k][s]=scn.nextInt();
            }
        }
        System.out.println("cost of houses are:");
        System.out.println("Pink "+"Orange "+"Yellow ");
        for(int k=0;k<ary.length;k++){
            for(int s=0;s<ary[0].length;s++){
                System.out.print(ary[k][s]+"   ");
            }
                System.out.println("");
        }
         System.out.println(costfinder(ary));
    }
}