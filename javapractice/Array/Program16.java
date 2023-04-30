//pallindrome no from an array
import java.util.*;
class Program16{
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
                        int rev=0;
			int temp=arr[i];
                        while(arr[i]!=0){
                                rev=rev*10+arr[i]%10;
                                arr[i]=arr[i]/10;
                        }
			if(temp==rev){
                           System.out.println("pallindrome is="+temp+" found at index="+i);
			}else{
				System.out.println("Not Pall="+temp);
			}
                }
        }
}
