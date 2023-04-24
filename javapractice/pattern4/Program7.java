class Program7{
	public static void main(String[] args){
		char ch='F';
		int no=1;
		for(int i=1;i<=6;i++){
			char temp=ch;
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print(temp+" ");
					temp++;
				}else{
					System.out.print(no+" ");
					no++;
				}
			}
			ch--;
			System.out.println();
		}
	}
}
