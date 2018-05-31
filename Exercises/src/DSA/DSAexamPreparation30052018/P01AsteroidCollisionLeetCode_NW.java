package DSA.DSAexamPreparation30052018;

import java.util.Arrays;
import java.util.LinkedList;

public class P01AsteroidCollisionLeetCode_NW {

  public static void main(String[] args) {

    Arrays.stream(asteroidCollision(new int[]{5, 10, -5})).forEach(x-> System.out.print(x + " "));
  }

  public static int[] asteroidCollision(int[] asteroids) {
    LinkedList<Integer> asteroidList = new LinkedList<>();

    for (int asteroid : asteroids
        ) {
      asteroidList.addLast(asteroid);
      if (asteroid < 0) {

        while (asteroidList.size() > 1) {

          int right = asteroidList.removeLast();
          int left = asteroidList.removeLast();

          if (left > 0 && right < 0) {
            if (left < -1 * right) {
              asteroidList.add(right);
            }
            if (left > -1 * right) {
              asteroidList.add(left);
            }
          } else {
            asteroidList.add(left);
            asteroidList.add(right);
            break;
          }
        }
      }
    }
    int[] result = new int[asteroidList.size()];
    for (int i = 0; i < asteroidList.size(); i++) {
      result[i] = asteroidList.removeFirst();

    }
    return result;
  }
}