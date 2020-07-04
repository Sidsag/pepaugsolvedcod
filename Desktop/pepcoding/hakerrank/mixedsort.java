import java.util.*;

public class mixedsort{

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]ar=new int[n];
        int[]arr=new int[n];
        int[]arry=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scn.nextInt();
        }
        for(int j=0;j<n;j++){
            arr[j]=scn.nextInt();
        }
        for(int k=0;k<n;k++){
            arry[k]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
         }
         System.out.println(" ");
          for(int j=0;j<n;j++){
              System.out.print(arr[j]+" ");
         }
         System.out.println(" ");
         for(int k=0;k<n;k++){
            System.out.print(arry[k]+" ");
         }
         System.out.println(" ");
        bubbleSort(ar);
        reverseinsertion(arr);
        selectionsort(arry);
        }
        public static void bubbleSort(int arr[])
        {
         int n = arr.length;
         for (int i = 0; i < n-1; i++)
             for (int j = 0; j < n-i-1; j++)
                 if (arr[j] > arr[j+1])
                 {
                     // swap temp and arr[i]
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
         for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
         }
         System.out.println(" ");
     }
     public static void selectionsort(int arr[] ){
         int n=arr.length;
         for(int i=0;i<n;i++){
           int  min_index=i;
           for(int j=i;j<n;j++){
               if(arr[j]<arr[min_index]){
                   min_index=j;
               }
           }
             //swap(arr[min_index],arr[i]);
             int temp = arr[min_index];
             arr[min_index] = arr[i];
             arr[i] = temp;
         }
         for(int k=0;k<n;k++){
         System.out.print(arr[k]+" ");
         }
         System.out.println(" ");
     }
     
     public static void reverseinsertion(int arr[]){
         int n=arr.length;
         for(int i=1;i<n;i++){
             int key=arr[i];
             int j;
           for(j=i-1;j<=0;j--){
               if(key>arr[j]){
                arr[j+1]=arr[j];
               }
               else
               break;
           }
              arr[j+1]=key;
         }
         for(int k=0;k<n;k++){
         System.out.print(arr[k]+" ");
         }
         System.out.println(" ");
     } 
}