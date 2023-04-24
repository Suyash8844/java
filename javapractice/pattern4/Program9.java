class Program9{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			int temp=i;
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print(temp*temp*temp+"\t");
				}else{
					System.out.print(temp*temp+"\t");
				}
				temp++;
			}
			System.out.println();
		}
	}
}
