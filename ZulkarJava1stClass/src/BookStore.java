import java.util.Scanner;


public class BookStore {
	
	static Scanner myScanner= new Scanner(System.in);
	
	static String[] books={"Java","C","Python"};
	static final double studentDiscount=0.3;
	static final double teacherDiscount=0.4;
	static final double alienDiscount=0.0;

	public static void main(String[] args) {
		prln("~~~~~~WELOCOME TO OUR BOOKSTORE~~~~~");
		prln("Which book do you want?\nAns: ");
		String userChoice=myScanner.nextLine();
		
		if (books[0].toLowerCase().equals(userChoice.toLowerCase())) {
			prln("you opted for "+books[0]+" Book ");
			calculatePrice(books[0]);
		}else if (books[1].toLowerCase().equals(userChoice.toLowerCase())){
			prln("you opted for "+books[1]+" Book ");
			calculatePrice(books[1]);
		}else if (books[2].toLowerCase().equals(userChoice.toLowerCase())){
			prln("you opted for "+books[2]+" Book ");
			calculatePrice(books[2]);
		}else {
			prln("Sorry, we don't have that Book ");
		}

	}
	
	static void calculatePrice(String bookName){
		prln("Are you a Student, Teacher, Alien?\nAns:");
		String answer=myScanner.nextLine();
		
		double price = 200;
		if (answer.toLowerCase().equals("teacher")) {
			price=price-(price*teacherDiscount);
			showPrice(price);
		}else if (answer.toLowerCase().equals("student")) {
			price=price-(price*studentDiscount);
			showPrice(price);
		}else if (answer.toLowerCase().equals("alien")) {
			price=price-(price*alienDiscount);
			showPrice(price);
		}else {
			prln("Sorry, We can't serve you!!");
		}
	}
	
	static void showPrice(double price){
			prln("Your total payable amount: "+price);
			prln("\n~~~~~~~~THANK YOU FOR SHOPPING FROM OUR BOOKSTORE~~~~~~~~~~~");
	}
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
