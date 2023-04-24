//WAP to print sum of all even numbers and multiplication of odd no.  betn. 1-10
class Program6{
	public static void main(String[] args){
		int no=10;
		int i=1;
		int sum=0;
		int mul=1;
		while(i<=no){
			if(i%2==0){
				sum=sum+i;
			}else{
				mul=mul*i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println(mul);
	}
}
