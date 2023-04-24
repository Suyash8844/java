//WAP to reverse a number
class Program19{
	public static void main(String[] args){
		int no=942111423;
		int rev=0;
		for(int i=1;i<=no;i++){
			rev=rev*10+no%10;
			no=no/10;
		}
		System.out.println(rev);
	}
}

