//composite no
import java.util.*;
class Program13{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter size of array");
                int size=sc.nextInt();
                System.out.println("Enter Elements of array");
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++)
                        arr[i]=sc.nextInt();
                
                for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=1;j*j<arr[i];j++){
				if(arr[i]%j==0)
					count++;
			}
			if(count>2)
				System.out.println("Composite "+arr[i]+" found at "+i+" index");
		}
	}
}
                        
