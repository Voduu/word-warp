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
            "\tTo begin, type 'S.' For help, type 'H'. To exit, type 'E'. ");
        
        Scanner scanner = new Scanner(System.in);

        while (!validInput) {
            input = scanner.nextLine().toLowerCase();

            System.out.printf("\t%s.\n", input);

            if (input == "s") {
                playGame();
            } else if (input == "h") {
                showHelp();
            } else if (input == "e") {
                exitGame(1);
                scanner.close();
            } else {
                System.out.printf("\tInvalid input. Please enter 'S' to begin" +
                ", 'H' for help, or 'E' to exit: ");
            }
        }

        scanner.close();
    }

    private void playGame() {

    }

    private void showHelp() {

    }

    private void exitGame(int exitCode) {

    }
}