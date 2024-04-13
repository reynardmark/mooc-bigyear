public class Bird {
  private String name;
  private String latinName;
  private int observation;

  private Bird(String name, String latinName){
    this.name = name;
    this.latinName = latinName;
    this.observation = 0;
  }

  public String getName() {
    return this.name;
  }

  public void incrementObservation() {
    observation++;
  }

  public String toString() {
    return String.format("%s (%s): %d observations", name, latinName, observation);
  }

  public static Bird createBird(String name, String latinName) {
    return new Bird(name, latinName);
  }

}
