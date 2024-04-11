package Assignments;

import java.util.Scanner;
public class TrafficSignals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Traffic signals :");
        System.out.println("1. Enter the colour green if you want to go ");
        System.out.println("2. Enter the colour yellow if you are prepared to stop ");
        System.out.println("3. Enter the colour red if you want to stop ");
        System.out.println("Enter your choice of your light signal ");

        String signal = scanner.nextLine();
        switch(signal){
            case "green":
                System.out.println(" You can proceed to go ");
                break;
            case "yellow":
                System.out.println(" Please prepare to stop ");
                break;
            case "red":
                System.out.println(" Please STOP before the lights");
                break;
            default:
                System.out.println(" Wrong input!! See you next time ");
        }

    }
}
