package Graph;

import java.util.Stack;

public class DFSGraphImplementation {

  private static int[][] graph;

  public static void main(String[] args) {
    dfs();
  }

  private static void dfs() {

    boolean[] used = new boolean[graph.length];

    Stack<Integer> stack = new Stack<>();
    int start = 1;
    stack.push(start);
    System.out.printf("%c ", start + 65);
    used[start] = true;

    while (!stack.isEmpty()) {

      int node = stack.peek();
      boolean hasUnusedNeighbours = false;

      for (int i = 0; i < graph[node].length; i++) {
        if (graph[node][i] != 0 && !used[i]) {
          System.out.printf("%c ", i + 65);
          stack.push(i);
          used[i] = true;
          hasUnusedNeighbours = true;
          break;
        }
      }
      if (!hasUnusedNeighbours) {
        stack.pop();
      }
    }
  }

  static {
    graph = new int[6][6];

    graph[0][1] = 1;
    graph[0][2] = 1;

    graph[1][0] = 1;
    graph[1][2] = 1;
    graph[1][4] = 1;

    graph[2][0] = 1;
    graph[2][1] = 1;
    graph[2][3] = 1;
    graph[2][4] = 1;

    graph[3][2] = 1;
    graph[3][4] = 1;

    graph[4][1] = 1;
    graph[4][2] = 1;
    graph[4][3] = 1;
    graph[4][5] = 1;

    graph[5][4] = 1;

  }
}
