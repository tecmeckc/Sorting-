import java.util.ArrayList;

public class practice {
  public static void Bsort(ArrayList<Integer> nums) {

    for (int i = 1; i < nums.size(); i++) {
      for (int j = 0; j < nums.size() - i; j++) {
        int p1 = nums.get(j);
        int p2 = nums.get(j + 1);
        if (p1 > p2) {
          nums.set(j, p2);
          nums.set(j + 1, p1);
        }
      }
    }

  }

  public static void Isort(ArrayList<Integer> nums) {
    for (int i = 1; i < nums.size(); i++) {
      int key = nums.get(i);
      int j = i - 1;
      while (j >= 0 && nums.get(j) > key) {
        nums.set(j + 1, nums.get(j));
        --j;
      }
      nums.set(j + 1, key);

    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(256);
    nums.add(20);
    nums.add(27);
    nums.add(2);
    nums.add(10);
    nums.add(5);
    Isort(nums);
    System.out.println(nums);

  }
}
