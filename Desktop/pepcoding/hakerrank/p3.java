import java.util.Scanner;

public class p3{

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int nst=1;
    int nsp=(n/2);
    for(int i=0;i<n;i++){
    for(int csp=0;csp<nsp;csp++){
    System.out.print(" "); 
    }
    for(int cst=0;cst<nst;cst++){
    System.out.print("*");}
    if(i<n/2){
    nsp--;
    nst+=2;
    }
    else{
    nsp++;
    nst-=2;
    }
    System.out.println(" ");
    }
}
}