import java.util.*;

public class p6 {
    public static void main(String[] args) {
       Scanner scn =new Scanner(System.in);
        int rows=scn.nextInt();
        int nst=1;
        int nsp=rows-1;
        for(int i=1;i<=rows;i++){
        for(int csp=1;csp<=nsp;csp++){
            System.out.print("  ");}
        int m=i;
        for(int cst=1;cst<=nst;cst++){
           System.out.print(m+" ");
            if(cst<=nst/2){
            m++;
            }
            else{
            m--;
            }
            }
        System.out.println(" ");
        nsp--;
        nst+=2;}
        }
        }