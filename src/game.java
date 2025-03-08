class game {
    int timeLimit;
    int wordSize;
    int score;

    public game(int timeLimit, int wordSize, int score) {
        this.timeLimit = timeLimit;
        this.wordSize = wordSize;
        this.score = score;
    }

    public game(int timeLimit, int wordSize) {
        this(timeLimit, wordSize, 0);
    }

    public game() {
        this(120,7,0);
    }

    protected void setScore(int score) {
        this.score = score;
    }

    protected void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    protected void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }

    protected int getScore() {
        return this.score;
    }

    protected int getTimeLimit() {
        return this.timeLimit;
    }

    protected int getWordSize() {
        return wordSize;
    }
}