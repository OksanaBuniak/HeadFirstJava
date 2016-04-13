package dotcom;

import java.util.*;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    private void SetUpGame() {

        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three doe coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComList) {

            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);

        }
    }

    private void startPlaying() {

        while(!dotComList.isEmpty()) {

            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);

        }
        finishGame();

    } //close startPaying


    private void checkUserGuess(String userGuess) {

        numOfGuesses++;
        String result = "miss";

        for (int x = 0; x < dotComList.size(); x++) {

            result = dotComList.get(x).checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(x);
                break;
            }

        } // close for

        System.out.println(result);
    } // close method


    private void finishGame() {

        System.out.println("All Dot Coms are dead! your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    } // close method


    public static void main (String [] args) {

        DotComBust game = new DotComBust();
        game.SetUpGame();
        game.startPlaying();

    } // close main

} // close class