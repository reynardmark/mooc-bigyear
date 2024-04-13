import java.util.Scanner;
import java.util.List;
import java.util.Optional;

public class UserInterface {
  private Scanner scanner;
  private BirdManager birdManager;

  private final String[] commands = {"Add", "Observation", "All", "One", "Quit"};

  public UserInterface(Scanner scanner, BirdManager birdManager) {
    this.scanner = scanner;
    this.birdManager = birdManager;
  }

  public void start(){
    while (true) {
      System.out.println("?");
      String input = scanner.nextLine();
      
      if (input.equals(commands[0])) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scanner.nextLine();

        birdManager.addBird(Bird.createBird(name, latinName));
      }

      if (input.equals(commands[1])) {
        System.out.println("Bird? ");
        String birdName = scanner.nextLine();

        
        Optional<Bird> foundBird = birdManager.findBird(birdName);

        if (foundBird.isPresent()) {
          foundBird.get().incrementObservation();
        } else {
          System.out.println("Not a bird!");
        }

      }

      if (input.equals(commands[2])) {
        List<Bird> birds = birdManager.getAllBirds();

        for (Bird bird: birds) {
          System.out.println(bird);
        }
      }

      if (input.equals(commands[3])) {
        System.out.println("Bird? ");
        String birdName = scanner.nextLine();
        System.out.println(birdManager.findBird(birdName));
      }
      
      if (input.equals(commands[4])) {
        return;
      }
    }
  }
}
