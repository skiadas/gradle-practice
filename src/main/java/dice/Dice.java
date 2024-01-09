package dice;

import java.util.Random;

class Dice {
  public int roll(int sides) {
    Random rand = new Random();
    return rand.nextInt(sides) + 1;
  }
}