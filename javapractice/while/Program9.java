//WAP to reverse a number
class Program9{
	public static void main(String[] args){
		int no=942111423;
		int rev=0;
		while(no!=0){
			rev=rev*10+no%10;
			no=no/10;
		}
		System.out.println(rev);
	}
}
