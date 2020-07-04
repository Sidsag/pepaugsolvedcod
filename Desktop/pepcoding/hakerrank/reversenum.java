import java.util.Scanner;

public class reversenum{

    public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    //System.out.println("enter the number to be reversed");
    double num=scn.nextInt();
    if(num>(10^9)){
    double n=num;
    double m=0;
    while(n!=0){
    double s=n%10;
    m=10*m+s;
    n=n/10;
    }
    System.out.println(m);
    }
    else
    System.out.println("invalid input");
    
    }
}