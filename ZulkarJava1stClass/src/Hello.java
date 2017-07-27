import java.util.Scanner;


public class Hello {
	static Scanner mc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Provide your name please?\n");
		
		String name=mc.nextLine();
		
		System.out.print("Hi "+name);

	}

}
