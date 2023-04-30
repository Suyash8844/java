//Strong no from an array
import java.util.*;
class Program17{
        public static void main(String[] args){
		int i;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter size of array");
                int size=sc.nextInt();
                System.out.println("Enter Elements of array");
                int arr[]=new int[size];
                for(i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		for(i=0;i<arr.length;i++){
			int sum=0;
			int no=arr[i];
			while(no!=0){
		         int rem=no%10;
			 int f=1;
			 for(int j=1;j<=rem;j++)
				 f=f*j;
			 
			 sum=sum+f;
			 no=no/10;
			}
			if(sum==arr[i]){
				System.out.println("Strong no= "+arr[i]+" found at "+i);
	            }
		}
	}
}
