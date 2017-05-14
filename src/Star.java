/**
 * Created by doug on 5/14/17.
 */
public class Star {

  private String name;
  private boolean isGreen;

  public Star(String name) {
    this.name = name;
    this.isGreen = name.toLowerCase().contains("green");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isGreen() {
    return isGreen;
  }

  public void setGreen(boolean green) {
    isGreen = green;
  }

  @Override
  public String toString() {
    if(!isGreen) {
      return "Star: " + name;
    } else {
      return "Star: " + name + " (green)";
    }
  }
}
