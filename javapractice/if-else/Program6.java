// WAP to find a maximum number between three
class Program6{
	public static void main(String[] args){
		int n1=3;
		int n2=2;
		int n3=3;
		if(n1>n2 && n2>n3){
			System.out.println(n1+" Is greater");
		}else if(n2>n1 && n1>n3){
			System.out.println(n2+" is greater");
		}else if(n3>n2 && n2>n1){
			System.out.println(n3+" is greater");
		}else if(n1==n2 && n2>n3){
			System.out.println("Both are equal and greater");
		}else if(n2==n3 && n3>n1){
			System.out.println("Both are equal and greater");
		}else if(n1==n3 && n3>n2){
			System.out.println("Both Are equal and greater");
		}else if(n1==n2 && n2==n3){
			System.out.println("They Are equal");
		}
	}
}
