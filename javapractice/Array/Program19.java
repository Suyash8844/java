//second max element in the array
import java.util.*;
class Program19{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter size of array");
                int size=sc.nextInt();
                System.out.println("Enter Elements of array");
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		if(size>2){
                for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		}else{
			System.out.println("You have Entered size of "+size);
		}
		System.out.println("Second largest no:"+arr[arr.length-2]);
	}
}
