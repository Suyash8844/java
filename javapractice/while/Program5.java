//WAP to print square of even digits of n number
class Program5{
	public static void main(String[] args){
		int no=942111423;
		while(no!=0){
			int rem=no%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			no=no/10;
		}
	}
}
