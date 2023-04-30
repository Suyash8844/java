//Perfect no from array
import java.util.*;
class Program15{
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
			int sum=0;
			for(int j=1;j<arr[i];j++){
				if(arr[i]%j==0)
					sum=sum+j;
			}
			if(sum==arr[i]){
				System.out.println("Perfect no "+arr[i]+" found at "+i);
			}
		}
	}
}
                        
