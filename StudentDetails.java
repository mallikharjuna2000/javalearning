import java.util.Scanner;
public class StudentDetails{
	public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String stdName=scanner.next();
        System.out.println("Enter Student Age : ");
        int stdAge=scanner.nextInt();
        System.out.println("Enter Student Marks : ");
        double marks=scanner.nextDouble();
        System.out.println("Enter that Student is Passed or not(y/n) : ");
        boolean isPassed=scanner.nextBoolean();
        System.out.println("Enter Student gender : ");
        char gender=scanner.next().charAt(0);
        
         System.out.println("Student Name : "+stdName);
          System.out.println("Student Age : "+stdAge);
          System.out.println("Student Marks : "+marks);
          System.out.println("Student psssed or not : "+isPassed);
          System.out.println("Student gender : "+gender);
	}
}