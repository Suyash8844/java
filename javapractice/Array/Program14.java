//prime no
import java.util.*;
class Program14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=sc.nextInt();
		System.out.println("Enter Elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=2){
				int count=0;
				for(int j=2;j*j<=arr[i];j++){
					if(arr[i]%j==0)
						count++;
				}
				if(count==0){
					System.out.println("Prime no "+arr[i]+" found at "+i+" index");
                  	}
		}
		
        }
   }
}   
