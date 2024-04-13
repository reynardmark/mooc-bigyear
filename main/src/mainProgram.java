
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BirdManager birdManager = new BirdManager();
        UserInterface userInterface = new UserInterface(scan, birdManager);
        userInterface.start();
    }

}
