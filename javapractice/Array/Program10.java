//addition of digit is even
import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0,i;
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter Elements in Arrar");
		int arr[]=new int[size];
		for(i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++){
			int temp=arr[i];
			while(temp!=0){
                         int rem=temp%10;
			 sum=sum+rem;
                         temp=temp/10;
		}
		if(sum%2==0){
		 System.out.println("Output="+arr[i]);
	}
	sum=0;
	
}
}
}

