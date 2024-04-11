package Assignments;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = scanner.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("The character you entered is a vowel ");
        }
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("The character you entered is a vowel ");
        }
        else{
            System.out.println("The character you entered is a constant ");
        }
    }
}
