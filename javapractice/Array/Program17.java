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
			int temp=arr[i];
			while(arr[i]!=0){
		         int rem=arr[i]%10;
			 int f=1;
			 for(i=1;i<=rem;i++){
				 f=f*i;
			 }
			 sum=sum+f;
			 arr[i]=arr[i]/10;
			}
			if(temp==sum){
				System.out.println("Strong no="+temp);
			}else{
				System.out.println("Not Strong no=");
			}
		}
	}
}
