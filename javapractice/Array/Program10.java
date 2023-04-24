import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0,i,count=0;
		System.out.println("Enter Size of Array");
		int size=sc.nextInt();
		System.out.println("Enter Elements in Arrar");
		int arr[]=new int[size];
		for(i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
			 sum=sum+arr[i]%10;
                         arr[i]=arr[i]/10;
		}
		 System.out.println("Addition of Digit="+sum);
	}
	
}

