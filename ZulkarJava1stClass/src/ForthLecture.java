import java.util.Scanner;


public class ForthLecture {
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=20;
		
//		int []numberArray=new int[100];
//		int i=100;
//		while (i>0) {
//			numberArray[i-1]=(i-1)*7;
//			i--;
//		}
		
		int [][] twoDArray=new int[2][4];
		
		twoDArray[0][0]=1;
		twoDArray[0][1]=2;
		twoDArray[0][2]=4;
		twoDArray[0][3]=5;
		
		twoDArray[1][0]=2;
		twoDArray[1][1]=4;
		twoDArray[1][2]=5;
		twoDArray[1][3]=9;
		
//	prln("please give your input: ");
	
	
//	for (int row = 0; row < 2; row++){
//		for (int column = 0; column < 4; column++) {
//			pr("twoDArray["+row+"]["+column+"] :");
//			
//			twoDArray[row][column]=myScanner.nextInt();
//			
//		}
//		
//	}
	
	try {
//		for (int row = 0; row < 2; row++) {
//			for (int column = 0; column < 4; column++) {
//				pr(twoDArray[row][column]+"\t");
//				
//			}
//			prln("\n");
//		}
		pr("please give a number: ");
		int userInput=myScanner.nextInt();
		while (userInput!=200) {
			prln((100/userInput));
			pr("please give a number: ");
			userInput=myScanner.nextInt();
			
		}
		
		
	} catch (Exception unknownException) {
		
		unknownException.printStackTrace();
		
	}finally{
		prln("came out of try catch block");
	}
	
	prln("thank you for using our program");
	
	
	
		
//	for (int j=3; j < 100; j*=2){
//		prln(j);
//		}
//	
	}
		//	prln(j);
		
		
		
//		while (i<100){
//			//prln("array["+i+" :"+numberArray[i]);
//			i++;
//		}
//		
//		int j=2;
//		do {
//			prln("do while loop:");
//			prln(j);
//			j--;
//		} while (j<2&&j>0);
//		
//		j=2;
//		while (j<2&&j>0) {
//			prln("while loop:");
//			prln(j);
//			j--;
//		}
		
		//prln("array ["+50+"] :"+numberArray[50]);
		
//		b=calculateNumber(a, b);
//		
//		prln(calculateNumber(a, b));
//		prln(a);
//
//	}
		

//	static int calculateNumber(int number1,int number2){
//		number1+=number2;
//		//int result=number1+number2;
//		return number1;
//		
//		//prln(a<b? "A is less then B":"B is less than A");
//		//prln(a<b? "A is less then B":"B is less than A");
//		
//}
//	
//	static String compare(int a,int b){
//		if (a<b){
//			return "A is less than B";
//		}else {
//			return "B is less than A";
//		}
//	}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
