package Practice;
import java.util.Scanner;
import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the lottery System to try your luck ");

        int randomNum = random.nextInt(100);
        int input = 2;
        do {
            System.out.println(" Enter the number in between 1-100 ");
            int num = scanner.nextInt();
            if (num == randomNum) {
                System.out.println(" Congratulations! You won the lottery ");
                return;

            } else {
                System.out.println(" Sorry your number didn't win this time Better Luck next time ");
                System.out.println("You are only left with " + input + " tries ");
                input--;
            }
        }while(input >= 0);;
        System.out.println(" Sorry you missed your all tries  ");
        System.out.println(" The winning number is :" + randomNum);

    }
}
