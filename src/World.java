import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by doug on 5/14/17.
 */
public class World {
  private String name;
  private List<Galaxy> galaxies = new ArrayList<>();

  public World(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Galaxy> getGalaxies() {
    return galaxies;
  }

  public void setGalaxies(List<Galaxy> galaxies) {
    this.galaxies = galaxies;
  }

  public Galaxy randomGalaxy(){
    return galaxies.get(new Random().nextInt(galaxies.size()));
  }

  @Override
  public String toString() {
    return "World: " + name;
  }
}
