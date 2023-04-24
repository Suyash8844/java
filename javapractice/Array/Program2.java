//Count even or odd elements in array.
import java.util.*;
class Program2{
        public static void main(String[] args){
                int count1=0,count2=0;
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
			}else{
				count2++;
			}
		}
                
        System.out.println("Number of Even Elements="+count1);
	System.out.println("Number of Odd Elements="+count2);
        }
}
