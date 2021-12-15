class Dices {
    private int numberOfDice;
    Dices(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
    int rollDice(){
        return ((int) (Math.random()*(6*numberOfDice - 1*numberOfDice))) + 1;
    }
}
