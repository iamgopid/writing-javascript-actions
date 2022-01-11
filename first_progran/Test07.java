package first_progran;
import java.util.*;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner remind=new Scanner (System.in);
		System.out.println("Enter the Number:");
		float a=remind.nextFloat();
		float b=a%3;
		float c=a%7;
		float d=a%17;
		float e=a%25;
		float result= b+c+d+e;
		System.out.println("modolous value of\t"+a+"\tis\t"+result);

	}

}
