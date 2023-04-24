class Program10{
        public static void main(String[] args){
		int no=1;
                for(int i=1;i<=4;i++){
                        int temp=no;
                        for(int j=1;j<=i;j++){
				if(i%2!=0){
                                 if(j%2==0){
                                        System.out.print(temp*temp*temp+"\t");
                                }else{
                                        System.out.print(temp*temp+"\t");
                                }
				}else{
                                if(j%2!=0){
                                        System.out.print(temp*temp*temp+"\t");
                               
				}else{
                                        System.out.print(temp*temp+"\t");
                                }
				}
				temp++;
				}
				no++;
                        System.out.println();
                }
        }
}
