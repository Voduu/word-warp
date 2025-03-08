import java.util.Scanner;
import java.io.File;

class WordWarp {
    final int CONSOLE_HEIGHT = 16;
    int wordLength = 7;
    int timeLimit = 120;

    public static void main(String[] args) {
        WordWarp p = new WordWarp();
        p.startGame();
    }

    private void startGame() {
        String input;

        System.out.printf("\tWelcome to Word Warp!\n");
        System.out.printf("\tBefore continuing, please ensure your console " + 
            "is at least %d rows tall.\n\n", CONSOLE_HEIGHT);
        
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.printf("\tPlease enter 'S' to begin, 'H' for help, " +
                "'O' for options, or 'E' to exit: ");
            input = userInput.nextLine().toLowerCase();

            if (input.equals("s")) {
                playGame(userInput);
            } else if (input.equals("h")) {
                System.out.printf("\n");
                showHelp(userInput);
            } else if (input.equals("o")) {
                System.out.printf("\n");
                showOptions(userInput);
            } else if (input.equals("e")) {
                exitGame(0);
                break;
            } else {
                System.out.printf("\tInvalid input.");
            }
        }
        userInput.close();
    }

    private void playGame(Scanner userInput) {

    }

    private void showHelp(Scanner userInput) {
        try {
            Scanner inFile = new Scanner(new File("../resources/help.txt"));
            int lineCount = 0;
            String input;

            while (inFile.hasNextLine()) {
                System.out.printf("\t\t%s\n", inFile.nextLine());
                lineCount++;

                // Hold for user input after every (CONSOLE_HEIGHT - 2) lines.
                if (lineCount % (CONSOLE_HEIGHT - 2) == 0) {
                    System.out.printf("\n\tPress any key to continue...");
                    input = userInput.nextLine();
                    System.out.printf("\n");
                }
            }

            inFile.close();

            System.out.printf("\n\n");
        } catch (Exception e) {
            System.out.printf("\n%s\n\n", e);
        }
    }

    private void showOptions(Scanner userInput) {
        System.out.printf("\t\tOptions not currently available.");
        System.out.printf("\n\n");
    }

    private void exitGame(int exitCode) {
        System.out.printf("\n\tExiting game...\n");
        System.exit(exitCode);
    }
}