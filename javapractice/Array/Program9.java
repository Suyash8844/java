//Write a Java Program to merge two given arrays.
import java.util.*;
class Program9{
	public static void main(String[] args){
		int i,k=0;
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[5];
		int arr2[]=new int[5];
		int arr3[]=new int[10];
		System.out.println("Enter 5 Elements");
		for(i=0;i<arr1.length;i++){
		    arr1[i]=sc.nextInt();
		}
		System.out.println("Enter 5 Elements");
		for(i=0;i<arr2.length;i++){
                    arr2[i]=sc.nextInt();
                }
		for(i=0;i<arr1.length;i++,k++){
			arr3[k]=arr1[i];
		}
		for(i=0;i<arr2.length;i++,k++){
			arr3[k]=arr2[i];
		}
		System.out.println("Merged Array is");
		for(i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
	}
}



