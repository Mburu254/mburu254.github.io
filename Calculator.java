import java.util.Scanner;

// Calculator
// A Paul Njuguna & Patience Nyarko creation

public  class Calculator{
	public static void add(int num1,int num2){
		int result=num1+num2;
		System.out.println("The sum is: "+result);
	}

	public static void subtract(int num1,int num2){
		int result=num1-num2;
		System.out.println("The subtration is: "+result);
	}
	public static void product(int num1,int num2){
		int result=num1*num2;
		System.out.println("The product is: "+result);
	}
	public static void division(int num1,int num2){
		float result=num1/num2;
		System.out.println("The division is: "+result);
	}
	public static void mod(int num1,int num2){
		float result=num1%num2;
		System.out.println(num1+" modulo "+num2+" is "+result);
	}
	public static void power(int num1,int num2){
		double result= Math.pow(num1,num2);
		System.out.println(num1+" raised to power of "+num2+" is "+result);
	}
	public static void squareRt(double num1){
		double result= Math.sqrt(num1);
		System.out.println("The square root of "+num1+" is "+result);
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
		System.out.println("-------------------");
		System.out.println("Enter below:");
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
			int f1,f2;

			System.out.println("Enter the first number:");
			f1 = Integer.parseInt(in.nextLine());

			System.out.println("Enter the second number:");
			f2 = Integer.parseInt(in.nextLine());

			add(f1,f2);
		}
		else if (option==5) {
			int f1,f2;

			System.out.println("Enter the first number:");
			f1 = Integer.parseInt(in.nextLine());

			System.out.println("Enter the second number:");
			f2 = Integer.parseInt(in.nextLine());

			subtract(f1,f2);
		}
		else if (option==6) {
			int f1,f2;

			System.out.println("Enter the first number:");
			f1 = Integer.parseInt(in.nextLine());

			System.out.println("Enter the second number:");
			f2 = Integer.parseInt(in.nextLine());

			product(f1,f2);
		}
		else if (option==7) {
			int f1,f2;

			System.out.println("Enter the first number:");
			f1 = Integer.parseInt(in.nextLine());

			System.out.println("Enter the second number:");
			f2 = Integer.parseInt(in.nextLine());

			division(f1,f2);
		}
		
	}
}