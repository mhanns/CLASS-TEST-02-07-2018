/*Maurice Hanns CSC 242 020720189
  	
  	String Brand, PhoneName;
	int yearReleased;
	double price;
	
	public Phone(String BD, String PN, int YR, double PR){
	 
 */

import java.util.Scanner; 

public class PhoneTestClass {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Phone item1 = new Phone ("iphone","X", 2017, 1000.00);
		Phone item2 = new Phone ("iphone","8", 2017, 899.00);
		Phone item3 = new Phone ("Samsung","Galaxy 8", 2017 , 800.00 );
		
		System.out.println("Hello user, I got some real good deals here!");
		System.out.println("Choose from the brands below.\n");
		
		System.out.println("Press (1) for: " + item1.Brand + " " + item1.PhoneName + " from " + item1.yearReleased);
		System.out.println("Press (2) for: " + item2.Brand + " " + item2.PhoneName + " from " + item2.yearReleased);
		System.out.println("Press (3) for: " + item3.Brand + " " + item3.PhoneName + " from " + item3.yearReleased);
		
		System.out.println("\nWhich one would you like the X, the 8, or the Galaxy!");
		int var = input.nextInt();

		
				
		
		if (var == 1){
			System.out.println("The price for the iPhone X is $" + item1.price);	
		}
		
		else if (var == 2){
			System.out.println("The price for the iPhone 8 is $" + item2.price);	
		}
		else if (var == 3){
			System.out.println("The price for the Samsung Galaxy 8 is $" + item3.price);	
		}
		else {
			System.out.println("You gave an invalid input of -->> " + var);
		}
	}

}
