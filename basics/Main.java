import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    
    // Runs pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // Runs flipNHeads
    flipNHeads(1);
    flipNHeads(2);

    // Runs clock
    clock();

  }

  public static String pluralize(String name, int number) {
    if (number == 1) {
      return name;
    } else {
      return name + "s";
    }
  }

  public static void flipNHeads(int n) {

    int numHeads = 0;
    int flips = 0;

    while (numHeads < n) {
      flips++;
      if (Math.random() >= 0.5) {
        numHeads++;
        System.out.println("heads");
      } else {
        numHeads = 0;
        System.out.println("tails");
      }
    }
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  }

  public static void clock() {

    LocalDateTime now = LocalDateTime.now();
    String time = now.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
    int second = now.getSecond();
    int cycles = 0;

    while (true) {
      now = LocalDateTime.now();

      if (now.getSecond() != second) {
        time = now.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
        second = now.getSecond();

        System.out.println(time + " " + cycles + " Hz");

        cycles = 0;
      } else {
        cycles ++;
      }
    }
  }

}