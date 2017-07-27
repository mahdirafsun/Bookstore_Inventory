import java.util.Scanner;


public class PascalTriangleTwo {

	static Scanner myScanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		prln("give -1 to exit");
		pr("give the lenght of pascal's triangle's lenght: ");
		int userInput=myScanner.nextInt();
		while (userInput!=-1) {
			if (userInput<-1||userInput>20) {
				prln("Please enter something between -1~20");
				userInput=myScanner.nextInt();
				continue;
			}
			
			printPascalTriangle(userInput);
			prln("\n\n");
			prln("Please enter something between -1~20");
			userInput=myScanner.nextInt();
			
		}
	
	}
	
	static void printPascalTriangle(int lenght){
		int[][] pascal=new int[lenght][lenght];
		
		for (int i = 0; i < lenght; i++) {
			pascal[0][i]=1;
			pascal[i][0]=1;
		}
		
		for (int row = 1; row < lenght; row++) {
			for (int column = 1; column < lenght-row; column++) {
				pascal[row][column]=pascal[row][column-1]+pascal[row-1][column];
			}
			
		}
		for (int row = 0; row < lenght; row++) {
			for (int column = 0; column < lenght-row; column++) {
				pr(pascal[row][column]+"\t");
			
			}
			prln("\n");
			}
	}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	// this is a print method
	
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

	
}
