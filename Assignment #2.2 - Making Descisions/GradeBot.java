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
        } else if (numerator < 0 || denominator < 0){
            System.out.println("Hey! No negative percents allowes!");
        } else if (denominator < numerator){
            System.out.println("I guess getting 100% was not even good enough for you.");
        } else {
            int percent = 100*(int)Math.round(numerator/denominator);
            System.out.print("You got " + percent + "% ");
            if (86 <= percent){
                //A
                System.out.println("which means you got an A!!! You must have studied super hard and it shows! Give yourself a pat on the back :)");
            }
            else if (73 <= percent) {
                //B
                System.out.println("which means you got a B!! Super job, you clearly know your stuff. You should be quite happy with yourself");
            }
            else if (67 <= percent) {
                //C+
                System.out.println("which means you got a C! Hey that's not too bad. There will always be people with higher and lower grades, so shake this one off.");
            }
            else if (60 <= percent) {
                //C
                System.out.println("which means you got a C. We all have our up's and down's and maybe this just wasn't your day. I'm sure you get 'em next time");
            }
            else if (50 <= percent) {
                //C-
                System.out.println("which means you got a C-... I mean, you passed and thats what matters right. Maybe try studying hard next time though");
            }
            else {
                //F
                System.out.println("which means you... uh... well you got an F. I'm guessing you forgot there was a test and um... you also never paid attention to the content? I'm sorry I don't know what to say, so maybe you should switch out of that class");
            }

        }

    }
}