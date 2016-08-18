import java.util.Scanner;
public class course1v5 {
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
	char mathOperation=scanTwo.nextLine().charAt(0);
	System.out.println("Please input another integer");
	int intTwo=scanThree.nextInt();
	if(mathOperation=="+".charAt(0)){
		System.out.println(intOne+intTwo);
	}else if(mathOperation=="-".charAt(0)){
		System.out.println(intOne-intTwo);
	}else if(mathOperation=="*".charAt(0)){
		System.out.println(intOne*intTwo);
	}else if(mathOperation=="/".charAt(0)){
		System.out.println(intOne*1.0/intTwo);
	}
}
}
