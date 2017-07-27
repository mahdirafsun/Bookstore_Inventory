import java.util.Scanner;


public class ThirdLecture {
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		String myName;
		
		pr("Please write your name: ");
		myName=myScanner.nextLine();
		
		//prln("the number of charecter in your name: "+myName.length());
		//prln("\n\nthis is our new method: ):");
		//prln(myName);
		//pr(myName);
		
		//    1 2 4 5
		//    2 4 5 9
		int [][] twoDArray=new int[2][4];
		
		twoDArray[0][0]=1;
		twoDArray[0][1]=2;
		twoDArray[0][2]=4;
		twoDArray[0][3]=5;
		
		twoDArray[1][0]=2;
		twoDArray[1][1]=4;
		twoDArray[1][2]=5;
		twoDArray[1][3]=9;
		
		twoDArray[1][3]+=(twoDArray[0][1]+twoDArray[0][3]);
		
		int a=3;
		int b=9;
		
		--b;
		a+=(b);
		prln("A:"+ a + " B:"+b);
		// for or(||), for and (&&) 
//		if (myName.length()<15 || myName.length()>3) {
//			prln("your name is too long or too short");
//		}else {
//			
//			
//			switch (myName.length()) {
//			case 7:
//				prln("your have a lucky name: ");
//				break;
//			case 6:
//				prln("your have a 6th char name: ");
//				break;
//			case 5:
//				prln("your have a 5th char name: ");	
//				break;
//			case 9:
//				prln("your have a 9 char long name: ");		
//				break;
//			default:
//				prln("your name is ok." );
//				break;
//			}
			
//			if (myName.length()==7) {
//			prln("your have a lucky name: ");
//		}else
//			prln("Your name is ok");
//	}
		
		//prln("At 2DArray [1][3]: "+twoDArray[1][3]);
		
	
				
				
		
		

	}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
