import java.util.Arrays;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please input the number of sides for the dice.");
        int sidesInput = sc.nextInt();
        System.out.println("Please input the number of players.");
        int playersInput = sc.nextInt();

        Die.setNumSides(sidesInput);

        Object[] players = new Object[playersInput];

        int[] rolls = new int[playersInput];

        for (int i = 0; i < playersInput; i++) {
            System.out.println("Please enter the player's name.");
            String playerName = sc.nextLine();
            Player.setName(playerName);
            players[i] = Player.getName();
        }
        System.out.println(Arrays.toString(players));

        for (int j = 0; j < playersInput; j++) {
            int roll = Die.roll();
            rolls[j] = roll;
            System.out.println("Player " + players[j] + " rolled a " + roll + " on a " + Die.getNumSides() + " sided die.");
        }
        System.out.println(Integer.parseInt(decideWinner(rolls)));
    }

    public static String decideWinner(int[] rolls) {
        return String.valueOf(Arrays.stream(rolls).max());
    }
}