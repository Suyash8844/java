class Composite{
	public static void main(String[] args){
		int cnt=0;
		int no=4;
		for(int i=1;i<=no;i++){
			if(no%i==0){
				cnt++;
			}
		}
		if(cnt>2){
			System.out.println("Composite");
		}else{
			System.out.println("not Composite");
		}
	}
}
