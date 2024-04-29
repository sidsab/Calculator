package com.example.calculator;

import com.example.calculator.builder.CalculationBuilder;
import com.example.calculator.builder.ConcreteCalculationBuilder;
import com.example.calculator.command.*;
import com.example.calculator.facade.Calculator;
import com.example.calculator.factory.AdditonCalculation;
import com.example.calculator.factory.Calculation;
import com.example.calculator.factory.CalculationFactory;
import com.example.calculator.strategy.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(CalculatorApplication.class, args);

		//Builder Pattern
		BigDecimal result;
		while(true)
		{
  			Scanner inputObj=new Scanner(System.in);
			String input1,input2;
			System.out.println("\n\n\nWelcome to Calculator App");
			System.out.println("\nPlease enter the first number");
			input1= inputObj.nextLine();
			System.out.println("\nPlease enter the second number");
			input2= inputObj.nextLine();
			BigDecimal a= new BigDecimal(input1);
			BigDecimal b= new BigDecimal(input2);
			System.out.println("Please provide the operation to be performed");
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Subtraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			int operation= inputObj.nextInt();
			ConcreteCalculationBuilder calculationBuilder=new ConcreteCalculationBuilder();
			com.example.calculator.builder.Calculation calculation= calculationBuilder.setFirstInput(a).SetSecondInput(b).build();;
			switch (operation)
			{
				case 1:
				{
					result= calculation.add();
					System.out.println("The result is "+result);
					break;
				}
				case 2:
				{
					result= calculation.substract();
					System.out.println("The result is "+result);
					break;
				}
				case 3:
				{
					result= calculation.multiply();
					System.out.println("The result is "+result);
					break;
				}
				case 4:
				{
					result= calculation.divide();
					System.out.println("The result is "+result);
					break;
				}
				default:
				{
					System.out.println("\nPlease enter the correct input");
					break;
				}
			}
		}

//		//Command Pattern
//		BigDecimal result;
//		while(true)
//		{
//		    Scanner inputObj=new Scanner(System.in);
//			String input1,input2;
//			System.out.println("\n\n\nWelcome to Calculator App");
//			System.out.println("\nPlease enter the first number");
//			input1= inputObj.nextLine();
//			System.out.println("\nPlease enter the second number");
//			input2= inputObj.nextLine();
//			BigDecimal a= new BigDecimal(input1);
//			BigDecimal b= new BigDecimal(input2);
//			System.out.println("Please provide the operation to be performed");
//			System.out.println("Enter 1 for Addition");
//			System.out.println("Enter 2 for Subtraction");
//			System.out.println("Enter 3 for Multiplication");
//			System.out.println("Enter 4 for Division");
//			int operation= inputObj.nextInt();
//			Command command;
//			Input input=new Input(a,b);
//			switch (operation)
//			{
//				case 1:
//				{
//					command=new AdditonCommand(input);
//					result= command.execute();
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 2:
//				{
//					command= new SubstarctionCommand(input);
//					result= command.execute();
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 3:
//				{
//					command= new MultiplicationCommand(input);
//					result= command.execute();
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 4:
//				{
//					command= new DivisionCommand(input);
//					result= command.execute();
//					System.out.println("The result is "+result);
//					break;
//				}
//				default:
//				{
//					System.out.println("\nPlease enter the correct input");
//					break;
//				}
//			}
//		}

//		//Facade Pattern
//		BigDecimal result;
//		while(true)
//		{
//			Scanner inputObj=new Scanner(System.in);
//			String input1,input2;
//			System.out.println("\n\n\nWelcome to Calculator App");
//			System.out.println("\nPlease enter the first number");
//			input1= inputObj.nextLine();
//			System.out.println("\nPlease enter the second number");
//			input2= inputObj.nextLine();
//			BigDecimal a= new BigDecimal(input1);
//			BigDecimal b= new BigDecimal(input2);
//			System.out.println("Please provide the operation to be performed");
//			System.out.println("Enter 1 for Addition");
//			System.out.println("Enter 2 for Subtraction");
//			System.out.println("Enter 3 for Multiplication");
//			System.out.println("Enter 4 for Division");
//			int operation= inputObj.nextInt();
//			Calculator calculator= new Calculator();
//			switch (operation)
//			{
//				case 1:
//				{
//					result= calculator.performAddition(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 2:
//				{
//					result= calculator.performSubstraction(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 3:
//				{
//					result= calculator.performMultiplication(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 4:
//				{
//					result= calculator.performDivision(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				default:
//				{
//					System.out.println("\nPlease enter the correct input");
//					break;
//				}
//			}
//		}

//		//Factory Pattern
//		BigDecimal result;
//		while(true)
//		{
//  		Scanner inputObj=new Scanner(System.in);
//			String input1,input2;
//			System.out.println("\n\n\nWelcome to Calculator App");
//			System.out.println("\nPlease enter the first number");
//			input1= inputObj.nextLine();
//			System.out.println("\nPlease enter the second number");
//			input2= inputObj.nextLine();
//			BigDecimal a= new BigDecimal(input1);
//			BigDecimal b= new BigDecimal(input2);
//			System.out.println("Please provide the operation to be performed");
//			System.out.println("Enter 1 for Addition");
//			System.out.println("Enter 2 for Substraction");
//			System.out.println("Enter 3 for Multiplication");
//			System.out.println("Enter 4 for Division");
//			int operation= inputObj.nextInt();
//			CalculationFactory calculationfactory= new CalculationFactory();
//			Optional<Calculation> calculation;
//			switch (operation)
//			{
//				case 1:
//				{
//					calculation= calculationfactory.GetCalculation(CalculationFactory.CalculationType.ADDITION);
//					result= calculation.orElseThrow(() -> new RuntimeException("Wrong operation input!")).calculate(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 2:
//				{
//					calculation= calculationfactory.GetCalculation(CalculationFactory.CalculationType.SUBSTARCTION);
//					result= calculation.orElseThrow(() -> new RuntimeException("Wrong operation input!")).calculate(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 3:
//				{
//					calculation= calculationfactory.GetCalculation(CalculationFactory.CalculationType.MULTIPLICATION);
//					result= calculation.orElseThrow(() -> new RuntimeException("Wrong operation input!")).calculate(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 4:
//				{
//					calculation= calculationfactory.GetCalculation(CalculationFactory.CalculationType.DIVISION);
//					result= calculation.orElseThrow(() -> new RuntimeException("Wrong operation input!")).calculate(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				default:
//				{
//					System.out.println("\nPlease enter the correct input");
//					break;
//				}
//			}
//		}

//		//Singleton Pattern
//		BigDecimal result;
//		while(true)
//		{
//		    Scanner inputObj=new Scanner(System.in);
//			String input1,input2;
//			System.out.println("\n\n\nWelcome to Calculator App");
//			System.out.println("\nPlease enter the first number");
//			input1= inputObj.nextLine();
//			System.out.println("\nPlease enter the second number");
//			input2= inputObj.nextLine();
//			BigDecimal a= new BigDecimal(input1);
//			BigDecimal b= new BigDecimal(input2);
//			System.out.println("Please provide the operation to be performed");
//			System.out.println("Enter 1 for Addition");
//			System.out.println("Enter 2 for Subtraction");
//			System.out.println("Enter 3 for Multiplication");
//			System.out.println("Enter 4 for Division");
//			int operation= inputObj.nextInt();
//			com.example.calculator.singleton.Calculator calculator= com.example.calculator.singleton.Calculator.getCalculatorInstance();
//			switch (operation)
//			{
//				case 1:
//				{
//					result= calculator.add(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 2:
//				{
//					result= calculator.substract(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 3:
//				{
//					result= calculator.multiply(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 4:
//				{
//					result= calculator.divide(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				default:
//				{
//					System.out.println("\nPlease enter the correct input");
//					break;
//				}
//			}
//		}

//		//Strategy Pattern
//		BigDecimal result;
//		String input1,input2;
//		while(true)
//		{
//			Scanner inputObj=new Scanner(System.in);
//			System.out.println("\n\n\nWelcome to Calculator App");
//			System.out.println("\nPlease enter the first number");
//			input1= inputObj.nextLine();
//			System.out.println("\nPlease enter the second number");
//			input2= inputObj.nextLine();
//			BigDecimal a= new BigDecimal(input1);
//			BigDecimal b= new BigDecimal(input2);
//			System.out.println("Please provide the operation to be performed");
//			System.out.println("Enter 1 for Addition");
//			System.out.println("Enter 2 for Subtraction");
//			System.out.println("Enter 3 for Multiplication");
//			System.out.println("Enter 4 for Division");
//			int operation= inputObj.nextInt();
//			Operation Operation;
//			switch (operation)
//			{
//				case 1:
//				{
//					Operation= new Operation(new AdditionStrategy());
//					result= Operation.performOperation(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 2:
//				{
//					Operation= new Operation(new SubstactionStrategy());
//					result= Operation.performOperation(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 3:
//				{
//					Operation= new Operation(new MultiplicationStrategy());
//					result= Operation.performOperation(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				case 4:
//				{
//					Operation= new Operation(new DivisionStrategy());
//					result= Operation.performOperation(a,b);
//					System.out.println("The result is "+result);
//					break;
//				}
//				default:
//				{
//					System.out.println("\nPlease enter the correct input");
//					break;
//				}
//			}
//		}
	}
}

