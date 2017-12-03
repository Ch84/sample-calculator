
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
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.divide(0, 0));
		System.out.println(calculator.divide(0, 5));
		System.out.println(calculator.divide(7, 0));
		System.out.println(calculator.divide(4, 3));
	 	
	}

}
