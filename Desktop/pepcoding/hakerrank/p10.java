import java.util.Scanner;

public class p10 {

    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       int rows=scn.nextInt();
       int lst=1;
       int rst=1;
       int nsp=2*(rows-1)-1;
        
      for(int i=1;i<=rows;i++){
         int m=1;
         for(int cl=1;cl<=lst;cl++){
         System.out.print(m+" ");
         m++;
         }
         for(int csp=1;csp<=nsp;csp++){
         System.out.print("  ");
         }
         int n=i;
         for(int cr=1;cr<=rst;cr++){
         System.out.print(n+" ");
         n--;
         }
         System.out.println(" ");
         if(i<rows-1){
         lst++;}
         rst++;
         nsp-=2;
      }
    
    }
}