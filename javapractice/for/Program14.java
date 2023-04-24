//WAP to count the odd digit of given no.
class Program14{
	public static void main(String[] args){
		int no=942111423;
		int cnt=0;
		for(int i=1;i<=no;i++){
			int rem=no%10;
			if(rem%2!=0){
				cnt++;
			}
			no=no/10;
		}
		System.out.println(cnt);
	}
}
