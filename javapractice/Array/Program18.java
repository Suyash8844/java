//Armstrong no from an array
import java.util.*;
class Program18{
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
			int sum=0,count=0;
			int no=arr[i];
			while(no!=0){
			     count++;
			     no=no/10;
			}
			no=arr[i];
			while(no!=0){
				int mul=1;
				int rem=no%10;
				for(int j=1;j<=count;j++){
					mul=mul*rem;
				}
				sum=sum+mul;
				no=no/10;
			}
			if(sum==arr[i]){
				System.out.println("Armstrong no "+arr[i]+" found at "+i);
		
			}
		}
	}
}

