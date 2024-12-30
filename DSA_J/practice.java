package DSA_J;

import java.util.Stack;

public class practice {
  public static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void nger(int[] arr) {
    Stack<Integer> stk = new Stack<>();
    int Nger[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      while (!stk.empty() && arr[i] > arr[stk.peek()])
        Nger[stk.pop()] = arr[i];
      stk.push(i);

    }
    while (!stk.empty())
      Nger[stk.pop()] = -1;
    display(Nger);
  }

  public static void nsel(int[] arr) {
    Stack<Integer> stk = new Stack<>();
    int Nsel[] = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!stk.empty() && arr[i] < arr[stk.peek()])
        Nsel[stk.pop()] = arr[i];
      stk.push(i);

    }
    while (!stk.empty())
      Nsel[stk.pop()] = -1;
    display(Nsel);
  }

  public static void rev(int[] arr, int i, int j) {
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

  public static void nser(int[] arr) {
    Stack<Integer> stk = new Stack<>();
    int Nsel[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      while (!stk.empty() && arr[i] < arr[stk.peek()])
        Nsel[stk.pop()] = arr[i];
      stk.push(i);

    }
    while (!stk.empty())
      Nsel[stk.pop()] = -1;
    display(Nsel);
  }

  public static void main(String[] args) {
    int[] nums = { 2, 1, 5, 6, 2, 3 };
    nsel(nums);
  }
}
