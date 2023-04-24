//even and odd no sum.
import java.util.*;
class Program3{
        public static void main(String[] args){
                int count1=0,count2=0,sum1=0,sum2=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter n Number");
                int n=sc.nextInt();
                System.out.println("Enter Elements in Array");
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<n;i++){
                        if(arr[i]%2==0){
                                count1++;
				sum1=sum1+arr[i];
                        }else{
				count2++;
                                sum2=sum2+arr[i];
			}

		}
		System.out.println("Sum of Even Elements="+sum1);
		 System.out.println("Sum of Odd Elements="+sum2);
                 
	
        }
}
