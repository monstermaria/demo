  
package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class HelloWorld {

//using get method and hello-world as URI  
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping(value = "/score", method = RequestMethod.GET)
	public String update(String rev) {
		StringBuilder sb = new StringBuilder(rev);

		return sb.reverse().toString();
	}

	@RequestMapping(value = "/addition", method = RequestMethod.GET)
	public String addition(String number1, String number2) {
		int n1 = 0;
		int n2 = 0;
		
		try {
			n1 = Integer.parseInt(number1);
			n2 = Integer.parseInt(number2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n1 + " + " + n2 + " = " + (n1 + n2);
	}
	@RequestMapping(value = "/multiplication", method = RequestMethod.GET)
	public String multiplication(String number1, String number2) {
		int n1 = 0;
		int n2 = 0;
		
		try {
			n1 = Integer.parseInt(number1);
			n2 = Integer.parseInt(number2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n1 + " * " + n2 + " = " + (n1 * n2);
	}
	@RequestMapping(value = "/division", method = RequestMethod.GET)
	public String division(String number1, String number2) {
		double n1 = 0;
		double n2 = 0;
		double result = 0;
		String textToReturn = "";
		
		try {
			n1 = Double.parseDouble(number1);
			n2 = Double.parseDouble(number2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (n2 != 0) {
//			textToReturn += "n2 != 0\n";
			result = n1 / n2;
		}
		
//		textToReturn += "number1: " + number1 + "\n";
//		textToReturn += "number2: " + number2 + "\n";
//		textToReturn += "result: " + result + "\n";
		
		return textToReturn + n1 + " / " + n2 + " = " + result;
	}
}