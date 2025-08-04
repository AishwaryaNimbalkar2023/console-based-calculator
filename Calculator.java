import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		char choice;
		Scanner sc=new Scanner(System.in);

		do{
			System.out.println("what you want to do:");
			System.out.println("1.addition");
			System.out.println("2.subtraction:");
			System.out.println("3.multiplication");
			System.out.println("4.Division");
			int sign=sc.nextInt();
			System.out.println("enter 1st number:");
			int num1=sc.nextInt();
			System.out.println("enter 2nd number:");
			int num2=sc.nextInt();
			switch(sign){
			case 1:
					addition(num1,num2);
					break;
			case 2:
					subtraction(num1,num2);
					break;
			case 3:
					multiplication(num1,num2);
					break;
			case 4:
					division(num1,num2);
					break;
			default:
					System.out.println("invalid operation");
			}
				System.out.println("do you want to do another calculation: y/ n");
				choice=sc.next().charAt(0);
		}
		while(choice=='y' || choice=='Y');
		sc.close();
	}

	public static void addition(int num1,int num2){
		System.out.println("Result:"+(num1+num2));
	}
	public static void subtraction(int num1,int num2){
		System.out.println("Result:"+(num1-num2));
	}
	public static void multiplication(int num1,int num2){
		System.out.println("Result:"+(num1*num2));
	}
	public static void division(int num1,int num2){
		if(num2!=0){
		System.out.println("Result:"+(num1/num2));
		}
		else{
			System.out.println("cant divide by zero");
		}
	}
}
