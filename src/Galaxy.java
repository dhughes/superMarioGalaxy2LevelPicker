import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by doug on 5/14/17.
 */
public class Galaxy {

  private String name;
  private List<Star> stars = new ArrayList<>();

  public Galaxy(String name) {

    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Star> getStars() {
    return stars;
  }

  public void setStars(List<Star> stars) {
    this.stars = stars;
  }

  public Star randomStar(){
    return stars.get(new Random().nextInt(stars.size()));
  }

  @Override
  public String toString() {
    return "Galaxy: " + name;
  }
}
