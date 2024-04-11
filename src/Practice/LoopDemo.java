package Practice;
import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        System.out.println(" Enter the end number of loop : ");

        int x = scanner.nextInt();
        int sum = 0;
        while( n <= x){
            System.out.println(n);
            sum = sum+n;
            n++;
        }
        System.out.println(sum);



    }
}
