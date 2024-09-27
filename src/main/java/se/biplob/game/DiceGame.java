package se.biplob.game;

import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void startGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Dice game. Whoever wins the most round wins the game. ");

        System.out.println("Please enter Player 1's name");
        Player first = new Player(sc.nextLine());
        System.out.println("Please enter Player 2's name");
        Player second = new Player(sc.nextLine());
        int dice1, dice2;
        boolean turn = true;
        Random num = new Random();
        while(turn){
            System.out.println("Rolling dices for " + first.getName() + ": ");
            System.out.println("Values of dices for " + first.getName() + ": ");
            dice1 = num.nextInt(1, 6);
            dice2 = num.nextInt(1, 6);
            System.out.println(dice1 + " " + dice2);
            first.setScore(dice1 + dice2);
            System.out.println("Your total value is: " + first.getScore());


            System.out.println("Rolling dices for " + second.getName() + ": ");
            System.out.println("Values of dices for " + second.getName() + ": ");
            dice1 = num.nextInt(1, 6);
            dice2 = num.nextInt(1, 6);
            System.out.println(dice1 + " " + dice2);
            second.setScore(dice1 + dice2);
            System.out.println("Your total value is: " + second.getScore());

            if(first.getScore()> second.getScore())
            {
                System.out.println(first.getName()+" is the winner.");
                first.increase();
                System.out.println(first.getWon());
            }
            else if(first.getScore()<second.getScore())
            {
                System.out.println(second.getName()+" is the winner");
                second.increase();
                System.out.println(second.getWon());
            }
            else
                System.out.println("Its a draw");

            System.out.println("Do you want to play another round? Enter your choice: Y/N");
            String choice;
            choice=sc.next();
            turn= choice.equalsIgnoreCase("y");

        }
        if(first.getWon()> second.getWon())
            System.out.println("congratulation "+first.getName()+" is the winner, won total "+first.getWon()+" rounds");
        else if (first.getWon()< second.getWon())
        System.out.println("congratulation "+second.getName()+" is the winner, won total "+second.getWon()+" rounds");
        else
            System.out.println("Congratulations to both. Its a draw.");

        sc.close();
    }
}
