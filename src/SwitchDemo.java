import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

         double result ;
         int input;
         do{
            System.out.println("Welcome to my Calculater");
            System.out.println("1. Press 1 for addition");
            System.out.println("2. Press 2 for multiplication");
            System.out.println("3. Press 3 for subtraction");
            System.out.println("4. Press 4 for division");
            System.out.println("5. Press 5 for modulus");
            System.out.println("6. Press 0  to exit ");
            System.out.println("Enter your choice : ");
            int num1;
            int num2;
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter the first number : ");
                    num1 = scanner.nextInt();
                    System.out.println("Enter the second number : ");
                    num2 = scanner.nextInt();
                    result = num1 + num2;
                    System.out.println(result);

                    break;
                case 2:
                    System.out.println("Enter the first number : ");
                    num1 = scanner.nextInt();
                    System.out.println("Enter the second number : ");
                    num2 = scanner.nextInt();
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case 3:
                    System.out.println("Enter the first number : ");
                    num1 = scanner.nextInt();
                    System.out.println("Enter the second number : ");
                    num2 = scanner.nextInt();
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Enter the first number : ");
                    num1 = scanner.nextInt();
                    System.out.println("Enter the second number : ");
                    num2 = scanner.nextInt();
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                case 5:
                    System.out.println("Enter the first number : ");
                    num1 = scanner.nextInt();
                    System.out.println("Enter the second number : ");
                    num2 = scanner.nextInt();
                    result = num1 % num2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Hope to see yopu again ");


            }
        }while(input!=0);



    }
}
