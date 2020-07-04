import java.util.Scanner;

public class fibp5 {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int str=0;
    int[] fibbo=new int[n];
    fib(fibbo,n);
    for(int i=1;i<=n;i++){
    for(int cst=0;cst<i;cst++){
     System.out.print(fibbo[cst]+" ");
     str++;
    }
    System.out.println(" ");} }
  public static int[] fib(int arr[],int a){
      arr[0]=1;
      arr[1]=1;
     for(int i=2;i<a;i++) {
      arr[i]=arr[i-1]+arr[i-2];   
     }
     return arr; 
    }
}   