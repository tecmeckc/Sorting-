package Sorting;

import java.util.Arrays;

public class Occurance {
  // Q1 find the number of occurances of target number in an array using binary
  // search method(upperbound and lowerbound concept)
  static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static int lowerBound(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    int lowBound = -1;
    // To find the first occurance i.e the lower bound
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        lowBound = mid;
        high = mid - 1;
      } else if (arr[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }

    }
    return lowBound;
  }

  static int upperBound(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    int upBound = arr.length;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        upBound = mid + 1;
        low = mid + 1;

      } else if (arr[mid] > target) {
        high = mid - 1;

      } else {
        low = mid + 1;
      }
    }

    return upBound;
  }

  static int occurance(int[] arr, int target) {
    int lowB = lowerBound(arr, target);
    int upB = upperBound(arr, target);
    return upB - lowB;
  }

  public static void main(String[] args) {
    int[] A = { 3, 4, 2, 3, 2, 1, 3, 4, 2, 3, 3, 1, 5 };
    Arrays.sort(A);
    display(A);
    System.out.println();
    System.out.println("The total number of occurences of the target is: " + occurance(A, 1));

  }
}