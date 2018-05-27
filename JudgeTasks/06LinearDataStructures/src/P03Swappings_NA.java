import java.util.Scanner;

public class P03Swappings_NA {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int n = Integer.parseInt(console.nextLine());
    String input = console.nextLine();

    String[] arrStr = input.split(" ");

    int[] swapNumbers = new int[arrStr.length];

    for (int i = 0; i < arrStr.length; i++) {
      swapNumbers[i] = Integer.parseInt(arrStr[i]);
    }

    Node end = new Node(-1);
    int num = 1;
    Node node = new Node(num++);
    node.previous = null;
    Node start = node;
    while (num <= n) {
      node.next = new Node(num);
      node.next.previous = node;
      node = node.next;
      num++;
    }

    end = node;
    Node newStart = start;
    Node tempStart = new Node(-1);
    Node tempEnd;

    for (int i = 0; i < swapNumbers.length; i++) {
      int steveNum = swapNumbers[i];
      while (start != null) {
        if (start.value == steveNum) {
          if (start.next.previous != null) {
            start.next.previous = null;
          }
          if (start.previous.next != null) {
            start.previous.next = null;

          }
          if (start.next == null) {
            tempStart=start.previous;
            start.previous = null;
            start.next = newStart;
            newStart = tempStart;
            end = start;
            break;

          }
          if(start.previous ==null){
            start.previous=null;
          }
          tempStart = start.next;
          tempEnd = start.previous;
          end.next = start;
          start.next = newStart;
          start.previous = end;
          newStart.previous = start;
          end = tempEnd;


          break;
        }
        start = start.next;

      }
      start = tempStart;

    }
    while(start !=null)

    {
      System.out.print(start.value + " ");
      start = start.next;
    }

  }

  public static class Node {
    private int value;
    Node previous;
    Node next;

    public Node(int value) {
      this.value = value;

    }
  }
}
