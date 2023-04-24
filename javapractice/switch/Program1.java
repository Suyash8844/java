import java.util.Scanner;
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Subject Marks");
		float sub1=sc.nextFloat();
		float sub2=sc.nextFloat();
		float sub3=sc.nextFloat();
		float sub4=sc.nextFloat();
		float sub5=sc.nextFloat();
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		System.out.println(sub4);
		System.out.println(sub5);
		float x;
		x=(sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("Total Marks is:" +x);
		switch(ch){
                  case1:
			  if(x>70){
				  System.out.println("First Class With Distinction");
				  break;
                  case2:
                          if(x>60){
                                 System.out.println("First Class");
                                  break;				  
		  case3:
                          if(x>50){
                                  System.out.println("Second Class");
                                  break;
                  case4:
                          if(x>40){
                                  System.out.println("Pass Class");
                                  break;
                  case5:
                          if(x<40){
                                  System.out.println("Fail");
                                  break;
	         default:
		       System.out.println("Invalid");		  

		
	}
}

