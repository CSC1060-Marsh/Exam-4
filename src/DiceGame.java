import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of sides for the dice.");
        int sidesInput = sc.nextInt();
        System.out.println("Please input the number of players.");
        int playersInput = sc.nextInt();

        Die.setNumSides(sidesInput);

        List<Object> players = new ArrayList<>();

        List<Integer> rolls = new ArrayList<>();
        List<Integer> clonedRolls = new ArrayList<>();

        for (int i = 0; i < playersInput; i++) {
            System.out.println("Please enter the player's name.");
            String playerName = sc.nextLine();
            Player.setName(playerName);
            players.add(playerName);
        }

        for (int j = 0; j < playersInput; j++) {
            int roll = Die.roll();
            rolls.add(roll);
            clonedRolls.add(roll);
            String output = "Player " + players.get(j) + " rolled a " + roll + " on a " + Die.getNumSides() + " sided die.";
            System.out.println(output);
        }

        int indexOfWinner = clonedRolls.indexOf(decideWinner(rolls));
        System.out.println("The winner of this game is " + players.get(indexOfWinner) + "!");

    }

    public static int decideWinner(List<Integer> rolls) {
        Collections.sort(rolls);
        int value = rolls.get(rolls.size() - 1);
        return value;
    }
}