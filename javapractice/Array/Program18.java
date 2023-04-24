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
			int sum=0;
			int temp=arr[i];
			while(arr[i]!=0){
				int a=arr[i]%10;
				sum=sum+a*a*a;
			}
			if(temp==sum){
				System.out.println("Armstrong no"+temp);
			}else{
				System.out.println("Not Armstrong"+temp);
			}
		}
	}
}

