import java.util.Scanner;
public class EvenOddTernaryOperator{
	public static void main(String[] args){
           // object creation syntax
           // classname objectname=new classname();
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter a Number ");
          int number=scanner.nextInt();
           // condition?exp1:exp2;
          String result=(number%2==0)?"even":"odd";
          System.out.println(result);
	}
}

// program to cheeck both numbers are divisible by 3
// program to cheeck both numbers are greater than 10
// program to cheeck atleast one numbers is negative
//// program to cheeck atleast one numbers is positive
