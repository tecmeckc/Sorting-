import java.util.*;

public class twoDArrays {
  // function to display a 2D array
  public static void display(int[][] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        System.out.print(nums[i][j] + " ");
      }
      System.out.println();
    }

  }

  // function to sort a 2D Array row wise
  public static void rowWiseSort(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      Arrays.sort(arr[i]);

    }
  }

  public static void sortByCol(int[][] arr, int col) {
    Arrays.sort(arr, (a, b) -> Integer.compare(a[col], b[col]));
  }

  public static void completeSorting(int[][] arr) {
    int rows = arr.length;
    int cols = arr[0].length;
    int[] temp = new int[rows * cols];
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        temp[cols * i + j] = arr[i][j];
    // Arrays.sort(temp);

    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        arr[i][j] = temp[cols * i + j];

  }

  // A function to implement binary search on a 2D array
  public static boolean binary2D(int[][] arr, int target) {
    int m = arr.length;
    int n = arr[0].length;
    int low = 0, high = (m * n - 1);
    while (low <= high) {
      int mid = high - (high - low) / 2;
      int row = mid / n, col = mid % n;
      if (arr[row][col] == target)
        return true;
      else if (arr[row][col] < target)
        low = mid + 1;
      else
        high = mid - 1;

    }
    return false;
  }

  // transpose of a matrix/2D array
  public static void transpose(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = 3, n = 5;
    int[][] nums = new int[m][n];
    int[][] arr = { { 1, 2, 3, 4, 5, }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

    System.out.println(binary2D(arr, 9));
    // how to input 1,2,3,4 and so on in a 2D array?
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = 0; j < nums[i].length; j++) {
    // nums[i][j] = nums[i].length * i + (j + 1);
    // }
    // }
    // System.out.println("The Array is: ");
    // display(nums);

  }
}
