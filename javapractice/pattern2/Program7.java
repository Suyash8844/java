class Program7{
	public static void main(String[] args){
		int no=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(no%2==1){
					System.out.print(no*no++ +" ");
					
				}else
					System.out.print(no++ +" ");
			}
			
			
		

			System.out.println();
		}
	}
}
