class Program9{
        public static void main(String[] args){
		int no=1;
                for(int i=1;i<=3;i++){
                        for(int j=1;j<=i;j++){
                                System.out.print(no*no*no+" ");
                                no++;
                        }
                        System.out.println();
                }
        }
}
