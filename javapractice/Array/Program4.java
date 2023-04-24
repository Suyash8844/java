//Search Specific no in Array and Return Index.
import java.util.*;
class Program4{
	public static void main(String[] args){
		int x,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		System.out.println("Enter Elements");
		int arr[]=new int[size];
		for(i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Elements to Search");
                x=sc.nextInt();
		for(i=0;i<arr.length;i++){
			if(arr[i]==x)
			{
				flag=1;
				break;
			}else{
				flag=0;
			}
		}
		if(flag==1){
			System.out.println("Elements Found at index="+i);
		}else{
			System.out.println("Elements Not Found");
		}
	}
}
