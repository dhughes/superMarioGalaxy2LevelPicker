import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SuperPicker {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(Paths.get("smg.txt"));

    List<World> worlds = new ArrayList<>();

//    World world = null;
//    Galaxy galaxy = null;
//    Star star = null;

    while(scanner.hasNextLine()){
      String line = scanner.nextLine();
      if(line.startsWith("\t\t")){
        // this is a star
        String starName = line.trim();

        List<Galaxy> galaxies = worlds.get(worlds.size()-1).getGalaxies();
        galaxies.get(galaxies.size()-1).getStars().add(new Star(starName));

      } else if(line.startsWith("\t")){
        // this is a galaxy
        String galaxyName = line.trim();

        worlds.get(worlds.size()-1).getGalaxies().add(new Galaxy(galaxyName));

      } else {
        // this is a world
        String worldName = line.trim();

        worlds.add(new World(worldName));

      }

    }

    World world = worlds.get(new Random().nextInt(worlds.size()));
    Galaxy galaxy = world.randomGalaxy();
    Star star = galaxy.randomStar();

    System.out.printf("%s\n\t%s\n\t\t%s\n", world, galaxy, star);
  }
}
