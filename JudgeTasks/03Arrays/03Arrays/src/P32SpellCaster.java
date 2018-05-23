import java.util.Scanner;

public class P32SpellCaster {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    String[] arr = console.nextLine().split(" ");

    StringBuilder word = new StringBuilder();

    word = getReversedWordFromArrWords(arr, false, new StringBuilder());

    StringBuilder result = new StringBuilder();

    result = wordManipulate(word);
    System.out.println(result);

  }

  public static StringBuilder getReversedWordFromArrWords(String[] arr, boolean isReverseFinished, StringBuilder word) {

    while (!isReverseFinished) {

      for (int i = 0; i < arr.length; i++) {
        String currentWord = arr[i];
        if (currentWord.length() > 0) {
          word.append(currentWord.charAt(currentWord.length() - 1));
          arr[i] = arr[i].substring(0, currentWord.length() - 1);
        } else {
          continue;
        }
      }
      int count = 0;
      for (String str : arr) {
        if (str.length() == 0) {
          count++;
        }

      }
      if (count == arr.length) {
        isReverseFinished = true;
      }
    }
    return word;
  }

  public static StringBuilder wordManipulate(StringBuilder word) {

    for (int i = 0; i < word.length(); i++) {
      int charNum = 0;
      if (word.charAt(i) < 95) {
        charNum = word.charAt(i) - 64;
      } else {
        charNum = word.charAt(i) - 96;
      }

      int index = (i+charNum) % word.length();
      char temp =  word.charAt(i);
      word.deleteCharAt(i);
      word.insert(index, temp);



    }
    return word;
  }
}

