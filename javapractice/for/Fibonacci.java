class Fibonacci{
	public static void main(String[] args){
		int no=5;
		int prev=1;
		int curr=0;
		int sum=0;
		for(int i=1;i<=no;i++){
			System.out.println(sum);
			sum=prev+curr;
			prev=curr;
			curr=sum;
		}
	}
}
