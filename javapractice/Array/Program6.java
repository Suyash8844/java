//Maximum Elements form the Array.
import java.util.*;
class Program6{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter Size");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter Array Elements");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                        }
                int max=arr[0];
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>max){
                                max=arr[i];
                        }
                }
                System.out.println("Max No is="+max);
        }
}
