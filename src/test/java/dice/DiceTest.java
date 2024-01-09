package dice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DiceTest {
  @Test
  void checkDiceInRange() {
    Dice d = new Dice();
    for (int i = 0; i < 100; i++) {
      int res = d.roll(6);
      assertTrue(res >= 1);
      assertTrue(res <= 1);
    }
  }
}