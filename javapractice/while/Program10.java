//WAP to pallindrome a number
class Program10{
        public static void main(String[] args){
                int no=1221;
                int rev=0;
		int t=no;
                while(no!=0){
                        rev=rev*10+no%10;
                        no=no/10;
                }
		if(t==rev){	
                    System.out.println("Pallindrome");
		}else{
			System.out.println("not pallindrome");
		}

        }
}
