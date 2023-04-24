//WAP which takes no. from user if no. is even print that no. in reverse
//order or if odd print that no.  in reverse order by diff. two
class Program7{
	public static void main(String[] args){
		int no=7;
		if(no%2==0){
			while(no!=0){
				System.out.println(no);
				no--;
			}
		}else{
			while(no>=0){
				System.out.println(no);
				no=no-2;
			}
		}
	}
}
