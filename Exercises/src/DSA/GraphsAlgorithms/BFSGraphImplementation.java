package DSA.GraphsAlgorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSGraphImplementation {
  private static List<List<Integer>> graph;

  public static void main(String[] args) {

    bfs();
  }


  private static void bfs() {

    List<Boolean> used = new ArrayList<>();

    graph
        .forEach(x -> used.add(false));

    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(0);
    used.set(0, true);

    while (!queue.isEmpty()) {

      int node = queue.remove();
      System.out.printf("%c ", node + 65);

      graph.get(node)
          .stream()
          .filter(x -> !used.get(x))
          .forEach(queue::add);

      graph.get(node).
          stream()
          .filter(x -> !used.get(x))
          .forEach(x -> used.set(x, true));

    }
  }

  static {

    graph = new ArrayList<>();

    graph.add(new ArrayList<>());
    graph.get(0).add(1);
    graph.get(0).add(2);

    graph.add(new ArrayList<>());
    graph.get(1).add(0);
    //graph.get(1).add(2);
    graph.get(1).add(4);

    graph.add(new ArrayList<>());
    graph.get(2).add(0);
   // graph.get(2).add(1);
    graph.get(2).add(3);
    graph.get(2).add(4);

    graph.add(new ArrayList<>());
    graph.get(3).add(2);
    graph.get(3).add(4);

    graph.add(new ArrayList<>());
    graph.get(4).add(1);
    graph.get(4).add(2);
    graph.get(4).add(3);
    graph.get(4).add(5);

    graph.add(new ArrayList<>());
    graph.get(5).add(4);
  }


}
