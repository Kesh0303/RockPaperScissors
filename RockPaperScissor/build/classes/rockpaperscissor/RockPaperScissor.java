package rockpaperscissor;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, now play Rock, Paper and Scissors");
        System.out.println("What is your name");
        String player1 = input.next();
        String Computer = " ";
        String player1move;
        int ComputerNumber;
        String Computermove = " ";

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Pick your move, \n R=rock \n P=paper \n S=scissors");
                player1move = input.next();
                player1move = player1move.toUpperCase();

                switch (player1move) {
                    case "R":
                        System.out.println(player1 + " has played rock");

                        break;

                    case "P":
                        System.out.println(player1 + " has played paper");
                        break;

                    case "S":
                        System.out.println(player1 + " has played scissors");
                        break;
                }

            } catch (Exception Error) {
                System.out.println(Error);
                System.out.println("Please input correct letters (R,S,P)");
                player1move = input.next();
            }

            ComputerNumber = random.nextInt(3) + 1;

            switch (ComputerNumber) {
                case (1):
                    Computermove = "R";
                    System.out.println("Computer has played rock");
                    break;

                case (2):
                    Computermove = "S";
                    System.out.println("Computer has played scissors");
                    break;

                case (3):
                    Computermove = "P";
                    System.out.println("Computer has played scissors");
                    break;
            }
            if (player1move.equals(Computermove)) {
                System.out.println("It is a tie");

            } else if (player1move.equals("R") && Computermove.equals("S")) {
                System.out.println("Player has won :)");

            } else if (player1move.equals("S") && Computermove.equals("R")) {
                System.out.println("Computer has won :)");

            } else if (player1move.equals("P") && Computermove.equals("R")) {
                System.out.println("Player has won :)");

            } else if (player1move.equals("R") && Computermove.equals("P")) {
                System.out.println("Computer has won :)");

            } else if (player1move.equals("S") && Computermove.equals("P")) {
                System.out.println("Player has won :)");
            } else if (player1move.equals("P") && Computermove.equals("S")) {
                System.out.println("Computer has won :)");
            }

        }
        System.out.println("How did u find the game ey?");
        String userinput = input.next();
        System.out.println("Only give good comments please :)");

    }
}
