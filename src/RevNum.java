import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		
		 int n, reverse = 0;
	      //System.out.println(123%10);
	      System.out.println("Enter the number to reverse");
	      Scanner in = new Scanner(System.in);
	      n = in.nextInt();
	 
	      while( n != 0 )
	      {
	          reverse = reverse * 10;
	          System.out.println(reverse);
	          reverse = reverse + n%10;
	          System.out.println(reverse);
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);

	}

}
