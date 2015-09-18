import java.util.Scanner;

// Calculator
// A Paul Njuguna & Patience Nyarko creation

public  class Calculator{
	//ADDITION
	public static void add(double num1,double num2){
		double result=num1+num2;
		System.out.println("The sum is: "+result);
	}
	//SUBTRACTION
	public static void subtract(double num1,double num2){
		double result=num1-num2;
		System.out.println("The subtration is: "+result);
	}
	//PRODUCT
	public static void product(double num1,double num2){
		double result=num1*num2;
		System.out.println("The product is: "+result);
	}
	//DIVISION
	public static void division(double num1,double num2){
		double result=num1/num2;
		System.out.println("The division is: "+result);
	}
	//MODULO
	public static void mod(int num1,int num2){
		int result=num1%num2;
		System.out.println(num1+" modulo "+num2+" is "+result);
	}
	//POWER
	public static void power(int num1,int num2){
		double result=1;
		for (int i=1;i<=num2;i++ ) {
		result=result*num1;
		}
		System.out.println(num1+" raised to power of "+num2+" is "+result);
	}
	//SQUARE ROOT
	public static void squareRt(double num1){
		double i;
 
	double result = num1 / 2;
 
	do{
		i = result;
		result = (i + (num1 / i)) / 2;
	} while ((i - result) != 0);
 
		System.out.println("The square root of "+num1+" is "+result);
	}
	//AVERAGE
	public static void average(int num1,int num2){
		float result=(float)num1+(((float)num2-(float)num1)/2);
		System.out.println("The average is: "+result);
	}
	public static void main(String[] args) {
		int option;
		Scanner in= new Scanner(System.in);

		System.out.println("CHOOSE AN OPTION");
		System.out.println("-------------------");
		System.out.println("1- Modulo");
		System.out.println("2- Power");
		System.out.println("3- Square root");
		System.out.println("4- Sum");
		System.out.println("5- Subtraction");
		System.out.println("6- Product");
		System.out.println("7- Division");
		System.out.println("8- average");
		System.out.println("-------------------");
		System.out.println("Enter choice(1-8):");
		option = Integer.parseInt(in.nextLine());

		if (option==1) {
			int f1,f2;

			System.out.println("Enter the first number:");
			f1 = Integer.parseInt(in.nextLine());

			System.out.println("Enter the second number:");
			f2 = Integer.parseInt(in.nextLine());

			mod(f1,f2);
		}
		else if (option==2) {
			int f1,f2;

			System.out.println("Enter the base number:");
			f1 = Integer.parseInt(in.nextLine());

			System.out.println("Enter the exponent number:");
			f2 = Integer.parseInt(in.nextLine());

			power(f1,f2);
		}
		else if (option==3) {
			double f1;

			System.out.println("Enter number:");
			f1 = in.nextDouble();

			squareRt(f1);
		}
		else if (option==4) {
			double f1,f2;

			System.out.println("Enter the first number:");
			f1 = in.nextDouble();

			System.out.println("Enter the second number:");
			f2 = in.nextDouble();

			add(f1,f2);
		}
		else if (option==5) {
			double f1,f2;

			System.out.println("Enter the first number:");
			f1 = in.nextDouble();

			System.out.println("Enter the second number:");
			f2 = in.nextDouble();

			subtract(f1,f2);
		}
		else if (option==6) {
			double f1,f2;

			System.out.println("Enter the first number:");
			f1 = in.nextDouble();

			System.out.println("Enter the second number:");
			f2 = in.nextDouble();

			product(f1,f2);
		}
		else if (option==7) {
			double f1,f2;

			System.out.println("Enter the first number:");
			f1 = in.nextDouble();

			System.out.println("Enter the second number:");
			f2 = in.nextDouble();

			division(f1,f2);
		}
		else if (option==8) {
			int f1,f2;

			System.out.println("Enter the first number:");
			f1 = in.nextInt();

			System.out.println("Enter the second number:");
			f2 = in.nextInt();

			average(f1,f2);
		}
	}
}