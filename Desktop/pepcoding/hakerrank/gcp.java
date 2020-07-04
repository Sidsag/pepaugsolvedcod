import java.util.Scanner;
public class gcp {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int num1=scn.nextInt();
    int num2=scn.nextInt();
    int g=gcd(num1,num2);
    System.out.println(g);
  }

  public static int gcd(int p,int q){
      int a,b,ans=0;
      if(p>q){
      a=p;
      b=q;
      }
      else{
      b=p;
      a=q;
      }
      int c=a%b;
      while(c>=1){
      c=a%b;
      if(c==0)
      ans=b;
      else if(c==1)
      ans=1;
      else
      a=b;
      b=c;
      }
      return ans;
     }
}