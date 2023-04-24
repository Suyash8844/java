//WAP to count digit of given number
class Program3{
	public static void main(String[] args){
		int no=942111423;
		int cnt=0;
		while(no!=0){
			cnt++;
			no=no/10;
		}
		System.out.println(cnt);
	}
}
