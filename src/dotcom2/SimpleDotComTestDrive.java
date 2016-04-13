package dotcom2;

/**
 * Created by Oksana on 4/11/16.
 */
public class SimpleDotComTestDrive {

    private static void setRandLocation(SimpleDotCom theDotCom) {
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
    }

    private static void playGame(SimpleDotCom theDotCom) {
        GameHelper helper = new GameHelper();
        int numOfGuesses = 0;

        while (true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                System.out.println("You took " + numOfGuesses + " guesses");
                return;
            } //close if
        } // close while
    }

    public static void main(String[] args) {
        SimpleDotCom theDotCom = new SimpleDotCom();
        setRandLocation(theDotCom);
        playGame(theDotCom);
    } // close main
} // close class