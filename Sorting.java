package Sorting;

import java.util.Arrays;

public class Sorting {

  static void display(int[] arr) {
    System.out.println("The sorted array is:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int bsearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  static int lowerBound(int[] arr, int num) {
    int low = 0, high = arr.length - 1;
    int ans = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == num) {
        ans = mid;
        high = mid - 1;
      } else if (arr[mid] > num) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  static int upperBound(int[] arr, int num) {
    int low = 0, high = arr.length - 1;
    int ans = arr.length;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == num) {
        ans = mid + 1;
        low = mid + 1;
      } else if (arr[mid] < num) {
        low = mid + 1;

      } else {
        high = mid - 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 1, 1, 1, 1, 6, 8, 4, 5, 9, 7 };
    Arrays.sort(arr);
    System.out.println(lowerBound(arr, 1));
    System.out.println(upperBound(arr, 1));
  }
}
