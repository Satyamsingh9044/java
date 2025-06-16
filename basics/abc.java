 import java.util.Scanner;
 public class abc{
      public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

          System.out.println("Enter a");
          int a =sc.nextInt();
          System.out.println("Enter b");
          
          int b =sc.nextInt();
          int c=a*b;
          System.out.print(c);
          // sc.close();
        }
    }
}