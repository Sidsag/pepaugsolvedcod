import java.io.*;
import java.util.*;

public class fibtilln{

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int a=0,b=1;
    while(a<=n){
    System.out.print(a+" ");
    int c=a+b;
    a=b;
    b=c;
    }
    }
}