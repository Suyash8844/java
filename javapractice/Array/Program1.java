//Sum of Elements in array.
import java.util.*;
class Program1{
	public static void main(String[] args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Number");
		int n=sc.nextInt();
		System.out.println("Enter Elements in Array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
	System.out.println("Sum is="+sum);
	}
}

