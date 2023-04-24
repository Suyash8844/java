class Program8{
	public static void main(String[] args){
		char ch='J';
		int no=10;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch+" ");
				}else{
					System.out.print(no+" ");
				}
				ch--;
				no--;
			}
			System.out.println();
		}
	}
}
