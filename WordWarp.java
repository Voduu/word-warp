import java.util.Scanner;

class WordWarp {
    public static void main(String[] args) {
        WordWarp p = new WordWarp();
        p.startGame();
    }

    private void startGame() {
        String input;
        boolean validInput = false;

        System.out.printf("\tWelcome to Word Warp!\n\n" +
            "\tTo begin, type 'S.' For help, type 'H'. To exit, type 'E': ");
        
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            input = scanner.nextLine().toLowerCase();

            if (input.equals("s")) {
                playGame();
            } else if (input.equals("h")) {
                showHelp();
            } else if (input.equals("e")) {
                exitGame(0);
            } else {
                System.out.printf("\tInvalid input. Please enter 'S' to begin" +
                ", 'H' for help, or 'E' to exit: ");
                continue;
            }
            validInput = true;
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