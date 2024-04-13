import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


public class BirdManager {
  private List<Bird> birds;

  public BirdManager() {
    this.birds = new ArrayList<Bird>();
  }

  public List<Bird> getAllBirds() {
    return this.birds;
  }

  public void addBird(Bird bird) {
    birds.add(bird);
  }

  public boolean hasBird(String birdName) {
    for (Bird bird:birds) {
      if (bird.getName().equals(birdName)){
        return true;
      }
    }
    
    return false;
  }

  public Optional<Bird> findBird(String birdName) {
    for (Bird bird:birds) {
      if (bird.getName().equals(birdName)) {
        return Optional.of(bird);
      }
    }

    return Optional.empty();
  }
}


