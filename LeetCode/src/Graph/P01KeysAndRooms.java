package Graph;

import java.util.List;

public class P01KeysAndRooms {

  public static void main(String[] args) {

  }

  class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

      int size = rooms.size();

      boolean[] visited = new boolean[size];
      dfs(rooms, 0, visited);
      for (boolean visit : visited
          ) {
        if (!visit) {
          return false;
        }
      }
      return true;
    }

    private void dfs(List<List<Integer>> rooms, int index, boolean[] visited) {
      if (visited[index]) {
        return;
      }
      visited[index] = true;

      for (int key : rooms.get(index)
          ) {

        if (!visited[key]) {
          dfs(rooms, key, visited);

        }
      }

    }
  }
}