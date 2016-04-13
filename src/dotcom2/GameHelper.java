package dotcom2;

/**
 * Created by Oksana on 4/11/16.
 */
//import java.io;

public class GameHelper {

    public String getUserInput(String prompt) {

        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            java.io.BufferedReader is = new java.io.BufferedReader (
                    new java.io.InputStreamReader(System.in));
            inputLine = is.readLine();

            if (inputLine.length() == 0) return null;

        } catch (java.io.IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

}
