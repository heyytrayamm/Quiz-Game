package Quizegame;

import java.util.Scanner;

public class Test_Main {

    public static void main (String[] args ) {

        String[] questions = {
                "Who is the Greatest World leader ?",
                "Who is the Pioneer of new Bharat?",
                "Which is the Largest  Party of World?",
                "Who is the Next PM ?" ,
                "Which is the Most Deadliest duo right now ?"
        };

        String[][] options = {
                {"1. Donald Trump" , "2. Rahul Gandhi" , "3. Xi jinping" , "4. Narendra Modi"},
                {"1. Mahatma Gandhi" , "2. Jawaharlal Neheru" , "3. Narendra Modi" , "4. Rahul Gandhi" , "5.Indira Gandhi"},
                {"1. TMC" , "2. CONGRESS" , "3. AAP" , "4. BJP" , "5. CPIM"},
                {"1. Rahul Gandhi" , "2. Akhilesh Yadav" , "3. Arvind Kejriwal" , "4. Narendra Modi" , "5.Mamata Banerjee"},
                {"1. Modiji-Putinji" , "2. Rahulji-Akhileshji" , "3. Trumpji-pakistanibhikhari" , "4. Kejriwalji-Mamtadidi" }
        };

        int[] answers = {4 , 3 , 4 , 4 , 1 };
        int guess;
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("WELCOME TO THE QUIZ GAME");
        System.out.println("****************************");

        for (int i = 0 ; i < questions.length ; i++) {
                System.out.println(questions[i]);
               for ( String option : options[i]) {
                   System.out.println(option);
               }
            System.out.print("Guess the answer :) ");
               guess = scanner.nextInt();

               if(guess == answers[i]) {
                   System.out.println("******************************");
                   System.out.println("Congo !! You Guessed right ");
                   System.out.println("******************************");
                   score ++;
               }
               else {
                   System.out.println("******************************");
                   System.out.println("Wrong guess !!");
                   System.out.println("******************************");
               }
            }

        System.out.println("******************************");
        System.out.println("END OF THE QUIZ");
        System.out.printf("You have Scored %d out of %d\n" , score , questions.length);
        System.out.println("******************************");


    }
}
