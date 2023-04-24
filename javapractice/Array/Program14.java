import java.util.*;
class Program14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=sc.nextInt();
		System.out.println("Enter Elements");
		int arr[]=new int[size];
		int count=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++)
		{       
		     for(int j=0;j<=i;j++)	{
			if(arr[i]%j==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		
		}
	}
}
	
}
