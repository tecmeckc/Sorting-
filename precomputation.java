package Sorting;

public class precomputation {
  // Ques :Check if any subarray has sum equal to your input and then print the
  // number of subarrays
  static void displayArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  static int subArrSum(int[] arr, int k) {
    int[] presum = new int[arr.length];
    presum[0] = arr[0];
    int count = 0;
    // input sum of array element s in the presum array
    for (int i = 1; i < arr.length; i++) {
      presum[i] = presum[i - 1] + arr[i];
    }
    // Generating subarrays
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int subarraySum;
        if (i == 0) {
          subarraySum = presum[j];
        } else {
          subarraySum = presum[j] - presum[i - 1];
        }

        if (subarraySum == k) {
          count++;
        }
      }
    }
    return count;
  }

  static int subArr(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int tempSum = 0;
      for (int j = i; j < arr.length; j++) {
        tempSum += arr[j];
        if (tempSum == target) {
          count++;
        }
      }
    }
    return count;

  }

  public static void main(String[] args) {
    int[] A = { 1, 2, 2, 4, 5, 1, 2, 2 };
    System.out.println("The number of subarrays of sum as the target is:" + subArrSum(A, 5));

  }
}
