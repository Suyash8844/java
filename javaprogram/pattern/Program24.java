class Program24{
	public static void main(String[] args){
		int no=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print("*"+" ");
				}else{
					System.out.print("#"+" ");
				}
			}
			System.out.println();
		}
	}
}
