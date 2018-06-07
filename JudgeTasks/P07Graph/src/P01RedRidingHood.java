import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P01RedRidingHood {

  private static  ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  private static int[] money;
  private static int bestMoney;
  private static int bestNode;

  public static void main(String[] args) throws IOException {

    BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(console.readLine());

    String[] stringMoney = console.readLine().split(" ");
    money = new int[n];

    for (int i = 0; i < n; i++) {
      money[i] = Integer.parseInt(stringMoney[i]);
    }

    for (int i = 0; i < n; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < n - 1; i++) {
      String[] readLine = console.readLine().split(" ");
      int a = Integer.parseInt(readLine[0]) - 1;
      int b = Integer.parseInt(readLine[1]) - 1;

      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    bestMoney = 0;
    bestNode = -1;

    dfs(0, -1, 0);

    bestMoney = 0;

    dfs(bestNode, -1, 0);
    System.out.println(bestMoney);
  }

  static void dfs(int x, int prev, int tempMoney) {
    tempMoney += money[x];
    boolean hasNext = false;

    for (int i : graph.get(x)
        ) {
      if (i != prev) {
        hasNext = true;
        dfs(i, x, tempMoney);
      }

    }
    if (!hasNext) {
      if (tempMoney > bestMoney) {
        bestMoney = tempMoney;
        bestNode = x;
      }
    }
  }
}
