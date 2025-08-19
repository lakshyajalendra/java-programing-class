import java.util.Scanner;
public class Lakshya {
  public static void main(String[] args) {
     System.out.println("my name is Lakshya");
     double pi=3.14;
     Scanner scanner = new Scanner(System.in); 
     System.out.println("enter your radious");
     
     int r = scanner.nextInt();
     double area = pi * r * r;

     System.out.println(area);
  }

}
//P T R
 import java.util.Scanner;
public class Lakshya {
  public static void main(String[] args) {
     System.out.println("my name is Lakshya");
     Scanner scanner = new Scanner(System.in); 
     System.out.println("enter your p");
     int P = scanner.nextInt();
      System.out.println("enter your T");
      int T = scanner.nextInt();
          System.out.println("enter your R");
        int R = scanner.nextInt();
    int cal = (P*T*R)/100;
     System.out.println("your answer is :"+cal);
  }
}
//calculater
 import java.util.Scanner;
public class Lakshya {
  public static void main(String[] args) {
     System.out.println("my name is Lakshya");
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("enter your first number");
     int P = scanner.nextInt();
     
      System.out.println("enter your second number");
      int T = scanner.nextInt();
    
     System.out.println("your addition is :"+ (P+T));
      System.out.println("your subtraction is :"+ (P-T));
         System.out.println("your multiplication is :"+ (P*T));
          System.out.println("your dived is :"+ (P/T));
             System.out.println("your modulo is :"+ (P%T));
  }
}