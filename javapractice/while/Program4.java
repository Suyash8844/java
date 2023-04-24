//WAP to count the odd digit of given no.
class Program4{
	public static void main(String[] args){
		int no=942111423;
		int cnt=0;
		while(no!=0){
			int rem=no%10;
			if(rem%2!=0){
				cnt++;
			}
			no=no/10;
		}
		System.out.println(cnt);
	}
}
