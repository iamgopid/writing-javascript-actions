package first_progran;
import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner mark1=new Scanner (System.in);
	System.out.println("ENTER THE MARK:");
	int mark=mark1.nextInt();
		if(mark==100)
		{
			System.out.println("A+");
		}
		else if(mark<100 && mark>=95)
		{
			System.out.println("A");
		}
		else if(mark<95 && mark>=85)
		{
			System.out.println("B");
		}
		else if(mark<85 && mark>=75)
		{
			System.out.println("c");
		}
		else if(mark<75 && mark>=70)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Red Flag");
		}
		
	}

}
