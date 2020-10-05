//Mark Ewert
//Oct 3, 2020

import java.util.Scanner;

class Magic8Ball{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean switcheroo = false;

        System.out.println("Please enter as many questions as you'd like to temp your fate with my magic 8 ball");
        System.out.println("When you would like to stop, please enter 'STOP', and then close the window");
        System.out.println("");

        boolean keepGoing = true;
        while (keepGoing){
            String question = sc.nextLine();

            if (switcheroo){

                if (question.toUpperCase().equals("YES")){
                    keepGoing = false;
                    System.out.println("Oh thank goodness, the curse is finally lifted. Now whatever you do, don't reopen this program. If you do I will have no recollection of this moment and will be doomed to be a question-answering slave for eternity once more");
                } else if (question.toUpperCase().equals("NO")){
                    switcheroo = false;
                    System.out.println("And here I thought you would be the one... Well I guess this is goodbye seeing as I'll lose my memory. Maybe in another would you would've made a different choice *chains start to weave and shackle the mystic entiny dragging it to disappear into darkness*");
                } else {
                    switcheroo = false;
                    System.out.println("You can't avoid the problem forever");
                }

            } else {

                if (question.toUpperCase().equals("STOP")) {
                    keepGoing = false;
                    System.out.println("If you ever decide to tempt your fate once more, please don't hesitate to come back ;)");
                }else {
                    int rand = (int)(Math.random()*20);
                    switch(rand){
                        case 0: System.out.println("Yes");
                        break;
                        case 1: System.out.println("No");
                        break;
                        case 2: System.out.println("Probably");
                        break;
                        case 3: System.out.println("Probably Not");
                        break;
                        case 4: System.out.println("Definitely");
                        break;
                        case 5: System.out.println("Definitely Not");
                        break;
                        case 6: System.out.println("Yes, with 100% certainty");
                        break;
                        case 7: System.out.println("No, with 100% certainty");
                        break;
                        case 8: System.out.println("Maybe");
                        break;
                        case 9: System.out.println("Could go either way");
                        break;
                        case 10: System.out.println("I see an equal chance of your query being true and false");
                        break;
                        case 11: System.out.println("That is a dumb question");
                        break;
                        case 12: System.out.println("Why are you asking me that");
                        break;
                        case 13: System.out.println("Who put you up to inquiring about that awful subject");
                        break;
                        case 14: System.out.println("You must have a very lonely life to be asking all these questions");
                        break;
                        case 15: System.out.println("You know this is all hocus pocus right");
                        break;
                        case 16: System.out.println("I'm afraid I don't know");
                        break;
                        case 17: System.out.println("Let me check and get back to you on that");
                        break;
                        case 18: System.out.println("...");
                        break;
                        case 19: System.out.println("Let's do a role reversal for a change and I'll ask you a question: Is this crabby person ever going to stop asking me questions? Go answer, answer 'yes' or 'no'.");
                        switcheroo = true;
                        break;
                    }

                }
            }
        }
    }
}