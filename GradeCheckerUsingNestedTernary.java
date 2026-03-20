import java.util.Scanner;
public class GradeCheckerUsingNestedTernary{
	public static void main(String[] args){
          Scanner scanner=new Scanner(System.in);
           System.out.println("Enter the marks.(marks between 0-100)");
           int marks=scanner.nextInt();
           if(marks>100){
             System.out.println("Marks should be more than 0 and less than 100");
              return;
            }
           char grade=(marks>=90)?'A':
                      (marks>=80)?'B':
                      (marks>=70)?'C':
                      (marks>=60)?'D':
                      (marks>=50)?'E':'F';

           String description=(marks>=90)? "Excellent":
                      (marks>=80)? "Very Good":
                      (marks>=70)? "Good":
                      (marks>=60)? "Satisfactory":
                      (marks>=50)? "Pass":"Fail";
           System.out.println("Grade   : "+grade);
           System.out.println("Description : "+description);
	}
}
