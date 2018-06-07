import java.util.*;

public class P04Packages {
  private static HashMap<Integer, List<Integer>> directedGraph;
  private static List<Integer> maxPath;

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    directedGraph = new HashMap<>();

    int edges = console.nextInt();

    for (int i = 0; i < edges; i++) {

      int edgeOne = console.nextInt();
      int edgeTwo = console.nextInt();

      if (!directedGraph.containsKey(edgeOne)) {
        directedGraph.put(edgeOne, new ArrayList<>());
      }
      if (!directedGraph.containsKey(edgeTwo)) {
        directedGraph.put(edgeTwo, new ArrayList<>());
      }
      directedGraph.get(edgeOne).add(edgeTwo);
    }
    int startEdgesNums = console.nextInt();

    int[] startingEdgeArr = new int[startEdgesNums];

    for (int i = 0; i <startEdgesNums ; i++) {
      startingEdgeArr[i] = console.nextInt();
    }

    for (int i = 0; i <startEdgesNums ; i++) {

      maxPath = new ArrayList<>();

      int startingEdge =  startingEdgeArr[i];

      dfs(startingEdge, new boolean[1024]);
      Collections.sort(maxPath);
      for (int path:maxPath
          ) {
        System.out.print(path + " ");

      }
      System.out.println();

    }
  }
  static void dfs(int currentEdge, boolean[] visitedEdges) {
    if (!visitedEdges[currentEdge]) {

      maxPath.add(currentEdge);
      visitedEdges[currentEdge] = true;

      for (int nextEdge : directedGraph.get(currentEdge)) {
        dfs(nextEdge, visitedEdges);
      }
    }
  }

}

