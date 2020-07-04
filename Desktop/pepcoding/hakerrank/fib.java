import java.io.*;
import java.util.*;

public class fib{

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int s=fibonaci(n);
    System.out.println(s);
    }
    
    public static int fibonaci(int a){
        if(a==0 || a==1){
            return a;
        }
        
        int b=fibonaci(a-1);
        int c=fibonaci(a-2);
        return b+c;
    }
}