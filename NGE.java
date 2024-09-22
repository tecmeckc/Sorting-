package Sorting;

public class NGE {
  static void displayArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");

    }
    System.out.println();
  }
  //classwork
  static int[] NGER(int[] arr) {
    int[] temp = new int[arr.length];
    int maxEl = -1;
    // input elements in NGER
    for (int i = arr.length - 1; i >= 0; i--) {
      temp[i] = maxEl;
      if (arr[i] > maxEl) {
        maxEl = arr[i];
      }
    }
    return temp;
  }
  //Homework
  static int[] NGEL(int[] arr) {
    int[] temp1 = new int[arr.length];
    int maxEl = -1;
    for (int i = 0; i < arr.length; i++) {
      temp1[i] = maxEl;
      if (arr[i] > maxEl) {
        maxEl = arr[i];
      }
    }
    return temp1;
  }

  public static void main(String[] args) {
    int[] A = { 1, 5, 7, 5, 8, 4, 6, 2 };
    int[] NGER = NGER(A);
    displayArray(NGER);
    System.out.println();
    int[] NGEL = NGEL(A);
    displayArray(NGEL);

  }
}
