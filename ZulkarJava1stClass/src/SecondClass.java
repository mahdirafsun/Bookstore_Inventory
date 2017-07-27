import java.util.Scanner;


public class SecondClass {
	
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		int firstShortNumber=11; //declare the variables 
		int secondIntNumber=2;
		
		int[] cards={7,3,4,5}; //array declare
		String [] cardsStrings={"apple","banana","watermilan"};
		char [] cardsChar={'3','4','5','6'};
		
		//firstShortNumber=19;
		secondIntNumber=3;
		
		float myFloatNumber=10;
		
		secondIntNumber=secondIntNumber+20;
		
		secondIntNumber+=2;
		secondIntNumber++; //secondIntNumber+=1; secondIntNumber=secondIntNumber+1; // opearator declare
		secondIntNumber--;
		double myDoubleNumber=10;
		
		int result=firstShortNumber%secondIntNumber;
		
		char myCharecter='A';
		boolean statement;
		
		System.out.print("please first number multipled by 100: ");
		firstShortNumber=myScanner.nextInt();
		
		int resultNew=prokriya(firstShortNumber); //method declare
		
//		System.out.println(firstShortNumber);
//		System.out.println(secondIntNumber);
//		System.out.println(cards[2]);
//		System.out.println(cardsStrings[2]);
//		System.out.println(cardsChar[2]);
		System.out.println(resultNew);
		

	}
	
	/*static public boolean prokriya(int firstValue, int secondValue) {
		boolean answer=firstValue>secondValue;
		return answer;
	}*/
	
	static public int prokriya(int firstValue){
		firstValue*=100;
		return firstValue;
	}
	

}
