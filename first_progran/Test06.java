package first_progran;
import java.util.*;
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner area =new Scanner (System.in);
		System.out.println("ENTER THE VALUE FOR L:");
		float l=area.nextFloat();
		System.out.println("ENTER THE VALUE FOR B:");
		float b=area.nextFloat();
		System.out.println("ENTER THE CHOICE \n 1.square\t2.rectangle\t3.circle\t4.triangle");
		int choice=area.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Area of the square:"+l*l);
			break;
		case 2:
			System.out.println("Area of the rectangle:"+l*b);
			break;
		case 3:
			System.out.println("Area of the circle:"+3.14*l*l);
			break;
		case 4:
			System.out.println("Area of the triangle:"+0.5*l*b);
			break;
			
		}
		

	}

}
