import java.util.Scanner;

class WordWarp {
    public static void main(String[] args) {
        WordWarp p = new WordWarp();
        p.startGame();
    }

    private void startGame() {
        String input;

        System.out.printf("\tWelcome to Word Warp!\n\n");
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("\tPlease enter 'S' to begin, 'H' for help, or " +
                "'E' to exit: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("s")) {
                playGame();
            } else if (input.equals("h")) {
                showHelp();
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

    }

    private void exitGame(int exitCode) {
        System.out.printf("\n\tExiting game...\n");
        System.exit(exitCode);
    }
}