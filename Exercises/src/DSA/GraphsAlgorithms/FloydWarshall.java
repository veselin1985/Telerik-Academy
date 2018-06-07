package DSA.GraphsAlgorithms;

import java.util.Scanner;

public class FloydWarshall {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int edges = console.nextInt();

    int[][] graph = new int[edges][3];


    for (int i = 0; i < graph.length; i++) {
      for (int j = 0; j < graph[i].length; j++) {
        graph[i][j] = console.nextInt();
      }
    }

    int[][] distance = new int[edges][edges];
    for (int i = 0; i < graph.length; i++) {
      {
        distance[graph[i][0]][graph[i][1]] = graph[i][2];
      }
    }
    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance.length; j++) {
        System.out.print(distance[i][j] + " ");

      }
      System.out.println();
    }

    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance.length; j++) {
        if (distance[i][j] == 0) {
          distance[i][j] = 100000;
        }
      }
    }

    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance.length; j++) {
        for (int k = 0; k < distance.length; k++) {
          if (distance[i][j] > distance[k][i] + distance[j][k]) {
            distance[i][j] = distance[k][i] + distance[j][k];
          }
        }
      }
    }
    System.out.println("---------------------");
    for (int i = 0; i < distance.length; i++) {
      for (int j = 0; j < distance.length; j++) {

        System.out.print(distance[i][j] + " ");

      }
      System.out.println();
    }
  }
}
