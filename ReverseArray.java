
public class ReverseArray {
  static void display(int[] arr, int x, int y) {
    for (int i = x; i < arr.length && i <= y; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static int findSum(int[] arr, int i, int j) {
    int sum = 0;

    for (int k = i; k < arr.length && k <= j; k++) {
      sum += arr[k];
    }
    return sum;
  }

  static void printRev(int[] arr, int x, int y) {
    System.out.println("The reversed array is:");
    for (int i = x; i < arr.length && i <= y; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

  }

  static void tempArr(int[] arr, int x, int y) {
    int[] temp = new int[arr.length];
    for (int i = x; i < arr.length && i <= y; i++) {
      temp[arr.length - 1 - i] = arr[i];
    }
    for (int i = x; i < arr.length && i <= y; i++) {
      arr[i] = temp[i];
    }
  }

  static void swap2(int[] arr, int x, int y) {
    int i = x;
    int j = y;
    while (i < j)
      swap1(arr, i++, j--);
    // i++;
    // j--;

  }

  static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  static void printRev(int[] arr) {
    System.out.println("The reversed array is:");
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

  }

  static void tempArr(int[] arr) {
    int[] temp = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      temp[arr.length - 1 - i] = arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = temp[i];
    }
  }

  static void swap1(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void swap2(int[] arr) {
    int i = 0;
    int j = arr.length - 1;
    while (i < j)
      swap1(arr, i++, j--);
    // i++;
    // j--;

  }

  public static void main(String[] args) {
    int[] nums = { 12, 23, 34, 45, 56, 76 };
    // making changes in the original array
    // tempArr(nums);
    // System.out.println("The original array is:");
    // display(nums);
    System.out.println("--------");
    System.out.println(findSum(nums, 1, 2));
    System.out.println("--------");

    printRev(nums, 1, 3);
    System.out.println("--------");

    tempArr(nums, 1, 4);
    display(nums, 1, 4);
    System.out.println("------");
    swap2(nums, 1, 4);

  }
}
