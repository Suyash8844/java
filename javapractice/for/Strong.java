class Strong{
	public static void main(String[] args){
		int no=145;
		int sum=0;
		int t=no;
		while(no!=0){
			int rem=no%10;
			int f=1;
			for(int i=1;i<=rem;i++){
				f=f*i;
			}
			sum=sum+f;
			 no=no/10;
		}
		if(t==sum){
			System.out.println("Strong ");
		}else{
			System.out.println("Not Strong");
		}
	}
}
