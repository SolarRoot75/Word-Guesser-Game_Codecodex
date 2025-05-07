import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int attempts = 5;
        String word = "java";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Guesser Game!\n");

        System.out.println(
            " ,-.\n" +
            " .:\\ '`-.\n" +
            " |:|  __ b\n" +
            " `;-(" + "\n" +
            " ,'  |\n" +
            " ( \\|||_\n" +
            " ,-----(.-''--``-------.\n" +
            " /_______`'______________\\\n" +
            "/                      SSt\\\n"
        );

        System.out.println("You have " + attempts + " attempts remaining to guess the secret word: _ _ _ _\n");

        while (attempts > 0) {
            System.out.print(">> ");
            String answer = scanner.nextLine().toLowerCase(); // Pour ignorer la casse

            if (answer.equals(word)) {
                System.out.println("\nCorrect! Press [p] to play again!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("\nIncorrect! You have " + attempts + " attempts remaining.\n");
                } else {
                    System.out.println("\nGame Over! The correct word was: " + word);
                }
            }
        }

        scanner.close();
    }
}
