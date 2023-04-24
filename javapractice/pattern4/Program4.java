class Program4{
        public static void main(String[] args){
                int no=1,k=1;
                for(int i=1;i<=4;i++){
			k=no;
                        for(int j=1;j<=4-i+1;j++){
                                System.out.print(k+" ");
                                k++;
                        }
                        no++;
                        System.out.println();
                }
        }
}
