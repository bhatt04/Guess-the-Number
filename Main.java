import java.util.*; //random

public class Main {

  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    int randomNumber = rand.nextInt(101); // 100 => random number between 0-99(0 inclusively 100 exclusively)
    // System.out.println("Random number is " + randomNumber);

    System.out.println(
        "    NUMBER GUESSING GAME \nA random number between 0-100 has been choose by the computer.\nYour task is to guess that number correctly in least number of tries possible.");
    System.out.println(" HAPPY GUESSING!");

    int tryCount = 0;
    while (true) {
      System.out.println("Enter your guess (1-100):");

      int playerGuess = scanner.nextInt();
      tryCount++;

      if (playerGuess == randomNumber) {
        System.out.println("Correct! You Win!");
        System.out.println("It took you " + tryCount + " tries");
        break;
      } else if (randomNumber > playerGuess) {
        System.out.println("Nope! The number is higher. Guess again.");
      } else {
        System.out.println("Nope! The number is lower. Guess again.");
      }
    }

  }
}