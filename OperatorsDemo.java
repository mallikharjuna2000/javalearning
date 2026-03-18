public class OperatorsDemo{
	public static void main(String[] args){
	  System.out.println("======Arithmetic Operators=========");
	  int a=17,b=5;
          System.out.println("a ="+a+ "| b ="+b);
          System.out.println("a + b = "+(a+b));
	  System.out.println("a - b = "+(a-b));
	  System.out.println("a * b = "+(a*b));
	  System.out.println("a / b = "+(a/b));
	  System.out.println("a % b = "+(a%b));
          System.out.println();
	  System.out.println("==== Relational Operators========");
         int marks=72;
         System.out.println("Mraks ===="+marks);
	 System.out.println("Marks>=50 : +"+(marks>=50));
          System.out.println("Marks==50 : +"+(marks==100));
	   System.out.println("Marks!=60 : +"+(marks!=60));
           System.out.println("Marks<50 : +"+(marks<50));
          System.out.println();
          System.out.println("======Logical Operators============");
          int age=22;
          boolean hasLicense=true;
          boolean canDrive=(age>=18)&&hasLicense;
           System.out.println("Age>=18 hasLicense : "+canDrive);
         boolean isMinorOrSenior=(age<18)||(age>60);
         System.out.println("agee <18 ||age>60 : "+isMinorOrSenior);
         boolean notMinor=!(age<18);
         System.out.println("!(age<18)  : "+notMinor);
         System.out.println();
         System.out.println("======= Compund Assignment Operators========");
         int score=100;
         System.out.println("Initial Score : "+score);
         score+=10;//score=score+10;
          System.out.println("After+= 10 :"+score);
         score-=5;
        System.out.println("After-= 5 :"+score);
         score*=2;
        System.out.println("After*= 2 :"+score);
        score/=3;
        System.out.println("After/= 3 :"+score);
        score%=8;
        System.out.println("After%= 8 :"+score);
        System.out.println();
        System.out.println("Operators Demo completed");




        
	}
}