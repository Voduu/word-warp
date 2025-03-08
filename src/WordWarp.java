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
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("\tPlease enter 'S' to begin, 'H' for help, " +
                "'O' for options, or 'E' to exit: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("s")) {
                playGame();
            } else if (input.equals("h")) {
                System.out.printf("\n");
                showHelp();
            } else if (input.equals("o")) {
                System.out.printf("\n");
                showOptions();
            } else if (input.equals("e")) {
                exitGame(0);
                break;
            } else {
                System.out.printf("\tInvalid input.");
            }
        }
        scanner.close();
    }

    private void playGame() {

    }

    private void showHelp() {
        try {
            Scanner inFile = new Scanner(new File("../resources/help.txt"));
            Scanner scanner = new Scanner(System.in);
            int lineCount = 0;
            String input;

            while (inFile.hasNextLine()) {
                System.out.printf("\t\t%s\n", inFile.nextLine());
                lineCount++;

                // Hold for user input after every (CONSOLE_HEIGHT - 2) lines.
                if (lineCount % (CONSOLE_HEIGHT - 2) == 0) {
                    System.out.printf("\n\tPress any key to continue...");
                    input = scanner.nextLine();
                    System.out.printf("\n");
                }
            }

            inFile.close();
            scanner.close();

            System.out.printf("\n\n");
        } catch (Exception e) {
            System.out.printf("\n%s", e);
        }
    }

    private void showOptions() {
        System.out.printf("\t\tOptions not currently available.");
        System.out.printf("\n\n");
    }

    private void exitGame(int exitCode) {
        System.out.printf("\n\tExiting game...\n");
        System.exit(exitCode);
    }
}