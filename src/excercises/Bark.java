package excercises;

/**
 * Created by Oksana on 4/6/16.
 */
public class Bark {

    int size;
    String breed;
    String name;

    void barking() {
        System.out.println("ruff! ruff!");
    }
}

class DogTestDrive {

    public static void main (String[] args) {

        Bark d = new Bark();
        d.size = 10;
        d.barking();
    }
}
