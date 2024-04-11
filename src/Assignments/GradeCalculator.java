package Assignments;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to Grade Calculator ");
        System.out.println(" Please enter the score of the student to calculate to equivalent grade : ");
        double score = scanner.nextInt();
        if(score >=90 && score <=100 ) {
            System.out.println(" Congratulation the student has achieved grade A ");
            System.out.println(" Thank you for using Grade Calculator ");
        }
        else if(score >=80 && score <=89){
            System.out.println(" Congratulations the student has achieved grade B, and can do better next time ");
            System.out.println(" Thank you for using Grade Calculator ");
        }
        else if(score >= 70 && score <=79){
            System.out.println(" Congratulations the student has achieved grade C, and can do better next time ");
            System.out.println(" Thank you for using Grade Calculator ");
        }
        else if(score >=60 && score <=69){
            System.out.println(" This time the grade is D, need to work hard to achieve better grade ");
            System.out.println(" Thank you for using Grade Calculator ");
        }
        else if(score >=0 && score <59){
            System.out.println(" Unfortunately student has failed the examination and have to re-appear to proceed to next standard ");
            System.out.println(" Thank you for using Grade Calculator ");
        }
        else{
            System.out.println(" The score that you have entered is invalid. Please enter the score correctly next time to proceed. Thank you so much for using Grade Calculator ");
        }


    }
}
