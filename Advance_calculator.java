/*Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.
/*Create method members
	init - to input X and Y from user
	add - to add X and Y and store in R
	multiply - to multiply X and Y and store in R
	power - to calculate X Y and store in R
	display- to display Result R */

cgjncgjngd
fghncgjn
hjcfj
gvfjfv
import java.util.Scanner;
public class Math_Operation{
	private int x,y,r;
	Scanner s=new Scanner(System.in);
	
	public void init()
	{
		System.out.println("Enter first no");
		x=s.nextInt();
		System.out.println("Enter second no");
		y=s.nextInt();
	}
	 public void add()
	 {
		r=x+y; 
	 }
	public void multiply()
	{
		r=x*y;
	}
	public void power()
	{
		for(int i=1;i<=y;i++)
				r=r*x;
	}
	

	public void display()
	{
		System.out.println("result = "+r);
	}
	public static void main(String[]args)
	{
		Math_Operation m=new Math_Operation();
		m.init();
		m.add();
		m.display();
		m.multiply();
		m.display();
		m.power();
		m.display();
	}
}
