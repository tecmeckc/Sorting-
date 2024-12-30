import java.util.ArrayList;
// import java.util.Collections;

public class sort {
  public static void bubbleSort(ArrayList<Integer> arr) {
    for (int turn = 1; turn < arr.size(); turn++) {
      for (int j = 0; j < arr.size() - turn; j++) {
        int one = arr.get(j);
        int two = arr.get(j + 1);
        if (one > two) {
          arr.set(j, two);
          arr.set(j + 1, one);

        }
      }
    }

  }

  public static void insertionSort(ArrayList<Integer> arr) {
    for (int i = 1; i < arr.size(); i++) {
      int key = arr.get(i);
      int j = i - 1;
      while (j >= 0 && arr.get(j) > key) {
        arr.set(j + 1, arr.get(j));
        --j;
      }
      arr.set(j + 1, key);

    }
  }

  public static void displayA(ArrayList<Integer> arr) {
    System.out.print(arr);
  }

  public static void main(String[] args) {
    ArrayList<Integer> a1 = new ArrayList<>();
    a1.add(12);
    a1.add(2);
    a1.add(222);
    a1.add(10);

    insertionSort(a1);
    displayA(a1);
  }
}
