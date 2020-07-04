import java.io.*;
import java.util.*;

public class p2 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int row=scn.nextInt();
        int nsp=1;
        int lst=(row+1)/2;
        int rst=(row+1)/2;
        for(int i=1;i<=row;i++){
            for(int clst=1;clst<=lst;clst++){
            System.out.print("*");
            }
            for(int csp=1;csp<=nsp;csp++){
            System.out.print(" ");
            }
            for(int crst=1;crst<=rst;crst++){
            System.out.print("*");
            }
            if(i<=(row/2)){
            nsp+=2;
            lst--;
            rst--;
            }
            else {
            nsp-=2 ;
            lst++;
            rst++;
            }
            System.out.println(" ");
        }
    }
}