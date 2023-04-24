//WAP to print square of even digits of n number
class Program15{
	public static void main(String[] args){
		int no=942111423;
		for(int i=1;i<=no;i++){
			int rem=no%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			no=no/10;
		}
	}
}

