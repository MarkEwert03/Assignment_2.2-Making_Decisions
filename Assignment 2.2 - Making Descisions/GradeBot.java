//Mark Ewert
//Oct 2, 2020

import java.util.Scanner;

class GradeBot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What was the test out of?");
        double denominator = sc.nextDouble();
        System.out.println("What mark did you get?");
        double numerator = sc.nextDouble();
        if (denominator == 0){
            System.out.println("Are you trying to make me crash by dividing by zero??");
        } else if (numerator < 0){
            System.out.println("No Negative numbers");
        }
    }
}