//WAP to count digit of given number
class Program13{
	public static void main(String[] args){
		int no=942111423;
		int cnt=0;
		for(int i=1;i<=no;i++){
			cnt++;
			no=no/10;
		}
		System.out.println(cnt);
	}
}

