import java.util.Scanner;

public class TestScore {

    public static void main(String[] args)
    {
        int testScore1;
        int testScore2;
        int testScore3;
        int testScore4;
        int testScore5;
        double testScoreAverage;
        String quitProgram = "q";
        String continueProgram = "c";

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to my Test Average Program. If you want to quit press \"q\" or \"c\" to continue.");

        if (userInput.equals(quitProgram)){
            System.out.println("Goodbye");
        } while (userInput.equals(continueProgram)) {
        //The user inputs their first and last name here
        Scanner userName = new Scanner(System.in);
        System.out.print("Please enter your first name then press 'Enter': ");
        String yourFirstName = userName.nextLine();
        char firstInitial = yourFirstName.charAt(0);
        System.out.print("Please enter your last name then press 'Enter': ");
        String yourLastName = userName.nextLine();

        //The user inputs their 5 test scores
        Scanner userTestScore = new Scanner(System.in);
        System.out.println("Please enter 5 of your most recent test scores. Press 'Enter' after every entry: ");
        testScore1 = userTestScore.nextInt();
        testScore2 = userTestScore.nextInt();
        testScore3 = userTestScore.nextInt();
        testScore4 = userTestScore.nextInt();
        testScore5 = userTestScore.nextInt();
        testScoreAverage = ((testScore1 + testScore2 + testScore3 + testScore4 + testScore5) / 5);

        //Outputs a greeting with the user's name and average test score
        System.out.println("Hello " + firstInitial + ". " + yourLastName + "." + " Your average test score is " + testScoreAverage + "%");

        //Letter grade for the average test score
        if (testScoreAverage >= 90) {
            System.out.print("That is an A");
        } else if (testScoreAverage >= 80) {
            System.out.print("That is a B");
        } else if (testScoreAverage >= 70) {
            System.out.print("That is a C");
        } else if (testScoreAverage >= 60) {
            System.out.print("That is a D");
        } else {
            System.out.print("That is a F");
        }
    }
    }
}