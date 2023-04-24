class Program5{
        public static void main(String[] args){
                char ch='A',k='A';
                for(int i=1;i<=4;i++){
                        k=ch;
                        for(int j=1;j<=4-i+1;j++){
                                System.out.print(k+" ");
                                k++;
                        }
                        ch++;
                        System.out.println();
                }
        }
}
