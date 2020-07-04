public class p1{
    import java.io.*;
import java.util.*;

import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n = scn.nextInt();
    int nst=1;
     for(int i=0;i<n;i++){
       for(int j=1;j<=nst;j++){
         System.out.print("*"+" ");
           
       }
        System.out.println(" ");
        nst++;
     }
    }
    
}
}