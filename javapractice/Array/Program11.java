//count of digit in elements
import java.util.*;
class Program11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		System.out.println("Enter Elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int count=0;
			while(arr[i]!=0){
				count++;
				arr[i]=arr[i]/10;
			}
			System.out.println("Cound is="+count);
			
		}
	}
}
