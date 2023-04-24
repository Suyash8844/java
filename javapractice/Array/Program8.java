//Uncommon Elements Between 2 Elements.
import java.util.*;
class Program8{
        public static void main(String[] args){
                int i,j;
                Scanner sc=new Scanner(System.in);
                int arr1[]=new int[5];
                System.out.println("Enter first Elements");
                for(i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                }
                int arr2[]=new int[5];
                System.out.println("Enter second Elements");
                for(j=0;j<arr2.length;j++){
                        arr2[j]=sc.nextInt();
                }
                for(i=0;i<arr1.length;i++){
                        for(j=0;j<arr2.length;j++){
                                if(arr1[i]!=arr2[j]){
                                        System.out.println("UnCommon Elements are="+arr1[i]);
                                }

                        }
                }
        }
}
