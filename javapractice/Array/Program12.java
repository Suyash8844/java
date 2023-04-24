import java.util.*;
class Program12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter Elements of array");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int rev=0;
			while(arr[i]!=0){
				rev=rev*10+arr[i]%10;
				arr[i]=arr[i]/10;
			}
			System.out.println("Reverse is"+rev);
		}
	}
}

