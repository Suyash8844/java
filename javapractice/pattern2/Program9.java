class Program9{
	public static void main(String[] args){
		int no=1;
		for(int i=1;i<=3;i++){
			int n=3;char ch='C';
			for(int j=1;j<=3;j++){
				System.out.print(no*no++);
				System.out.print(ch);
				ch--;
				System.out.print(n +" ");
				n--;
			}
			
			
			System.out.println();
		}
	}
}
