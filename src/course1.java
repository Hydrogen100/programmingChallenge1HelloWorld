import java.util.Scanner;
public class course1 {
public static void main(String args[]){
	//(print) asks user for integer input
	//input integer
	//(print) asks user for math operation
	//input math operation
	//(print) ask user for integer input
	//input integer
	//(print) answer
	Scanner scan=new Scanner(System.in);
	Scanner scanTwo=new Scanner(System.in);
	Scanner scanThree=new Scanner(System.in);
	System.out.println("Please input an integer");
	int intOne=scan.nextInt();

	System.out.println("Please input a math operation: +, -, *, or /");
	
	String mathOperation=scanTwo.nextLine();
	char mathOperationChar=mathOperation.charAt(0);
	
	//find way to convert from string to ASCII value
	int mathOperationValue=(int)mathOperationChar;
	System.out.println("Please input another integer");
	int intTwo=scanThree.nextInt();
	scan.close();
	if(mathOperationValue==43){
		System.out.println(intOne+intTwo);
		//change the rest of symbols to ASCII values
	}else if(mathOperationValue==45){
		System.out.println(intOne-intTwo);
	}else if(mathOperationValue==42){
		System.out.println(intOne*intTwo);
	}else if(mathOperationValue==47){
		System.out.println(intOne*1.0/intTwo);
	}
}
}
