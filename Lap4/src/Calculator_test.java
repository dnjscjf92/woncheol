import java.util.Scanner;

public class Calculator_test {

	
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.println("input : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.println("result (add) : "+ c.add(x, y));
		System.out.println("result (sub) : "+ c.sub(x, y));
		System.out.println("result (mul) : "+ c.mul(x, y));
		System.out.println("result (div) : "+ c.div(x, y));
		System.out.println("result (remainder) : "+ c.remainder(x, y));
		System.out.println("members : "+ c.toString());
	}
}
