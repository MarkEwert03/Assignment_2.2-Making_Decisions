//Mark Ewert
//Oct 2, 2020

import java.util.Scanner;

class Class_Secret{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the password?");
        String response = sc.nextLine();
        if (response.toLowerCase().equals("dragon")) {
           System.out.println("Correct! My secret is: I am Batman");
        } else {
            System.out.println("Incorrect! My secret is still safe...");
        }
    }
}