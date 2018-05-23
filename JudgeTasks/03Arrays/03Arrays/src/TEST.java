import java.util.ArrayList;

public class TEST {

  public static void main(String[] args) {


    String[] elements = {"1", "1", "2", "2"};

    String[] finalResult = getAllLists(elements, elements.length);

    for (String str : finalResult
      ) {
      System.out.println(str);

    }

  }




  public static String[] getAllLists(String[] elements, int lengthOfList) {
    //initialize our returned list with the number of elements calculated above
    String[] allLists = new String[(int) Math.pow(elements.length, lengthOfList)];

    //lists of length 1 are just the original elements
    if (lengthOfList == 1) return elements;
    else {
      //the recursion--get all lists of length 3, length 2, all the way up to 1
      String[] allSublists = getAllLists(elements, lengthOfList - 1);

      //append the sublists to each element
      int arrayIndex = 0;

      for (int i = 0; i < elements.length; i++) {
        for (int j = 0; j < allSublists.length; j++) {
          //add the newly appended combination to the list
          allLists[arrayIndex] = elements[i] + allSublists[j];
          arrayIndex++;
        }
      }

      return allLists;
    }
  }
}

