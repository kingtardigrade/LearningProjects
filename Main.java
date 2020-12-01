import java.util.Scanner;

/* 11/30/20
 * 	Goal of project:
 * 		To make a console based program that will show a temperature in a different 
 * 		unit of measurement ie: Fahrenheit, Celsius, and Kelvin
 */

public class Main {

	public static void main(String[] args) {
		//create a scanner variable to get information from user
			Scanner scanner = new Scanner(System.in);
			
		//variables
			double f;
			double c;
			double k;
			
			
		//Get user to enter a number and a unit in one string
			System.out.println("--KFC 1.0.0--");
			System.out.println("Please format as a number followed by the letter of the unit you want to calculate from");
			System.out.println("Enter Temperature:");
			
		//Gets string user entered
			String userInput = scanner.nextLine();
			
		//Creates character variable known as lastChar and assigns it a value of the final letter of an entered string
			char lastChar = userInput.charAt(userInput.length() - 1);
			
		//Takes the raw integer from the string and applies it to its own variable for the M A T H S
		//										\/changes everything that isn't a digit in the string to a blank
			int userNumber = Integer.parseInt(userInput.replaceAll("[\\D]", ""));
			
		//FUCKING MATHS
			//              \/ NOTE!: char variables require a ' rather then a " which denotes a string, took over an hour to figure out
			if(lastChar == 'f' || lastChar == 'F') {
				//im drunk and couldnt figure out long math so this is how i had to do it to make shit work
				c = userNumber-32;
				c = c*5;
				c = c/9;
				
				k = c+273.15;
				
				System.out.println(userInput+" is equal to " +c+ "°c, or " +k+ "°k.");
						
			}else if(lastChar == 'c' || lastChar == 'C') {
				f = userNumber*9;
				f = f/5;
				f = f+32;
				
				k = userNumber+273.15;
				
				System.out.println(userInput+" is equal to " +f+ "°f, or " +k+ "°k.");
			}else if(lastChar == 'k' || lastChar == 'K') {
				c = userNumber-273.15;
				
				f = c*9;
				f = f/5;
				f = f+32;
				
				System.out.println(userInput+" is equal to " +f+ "°f, or " +c+ "°c.");
				
			}else {
				System.out.println("There was an error, most likely your unit entry");
			}

	}

}
