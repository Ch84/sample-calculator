
/**
 * Main class. 
 * 
 * This project is a simple calculator where I have done test cases on it to test
 * it's functions and that everything is working correctly.
 * 
 * @author: Christian Hall
 * @version: 1.0
 * @since: 2017-11-22
 * 
 **/

public class Main {
	public static void main(String[] args){
		Calculator calc = new Calculator();
		
		double firstNumber = 10;
		double secondNumber = 20;
		
		System.out.println("Addition with: " + firstNumber + " and " + secondNumber + " = " + calc.add(firstNumber, secondNumber));
		System.out.println("Subtraction with: " + firstNumber + " and " + secondNumber + " = " + calc.add(firstNumber, secondNumber));
		System.out.println("Multiplication with: " + firstNumber + " and " + secondNumber + " = " + calc.add(firstNumber, secondNumber));
		System.out.println("Division with: " + firstNumber + " and " + secondNumber + " = " + calc.add(firstNumber, secondNumber));
		System.out.println("Division with: " + firstNumber + " and " + 0 + " = " + calc.add(firstNumber, 0));
	
	}

}
