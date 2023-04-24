class Program10{
	public static void main(String[] args){
		for(int i=1;i<=6;i++){
			 char ch='F';int no=5;
			for(int j=1;j<=6;j++){
				if(j%2!=0){
					System.out.print(ch +" ");
					ch--;
					ch--;
				}else{
					System.out.print(no +" ");
					no--;
					no--;
				}
				
			}
			System.out.println();
		}
	}
}
