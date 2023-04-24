class Program7{
	public static void main(String[] args){
		char ch='F';
		char ch1;
		for(int i=1;i<=6;i++){
			ch1=ch;
			for(int j=1;j<=i;j++){
				System.out.print(ch1+" ");
				ch1++;
			}
			ch--;
			System.out.println();
			
		}
	}
}
