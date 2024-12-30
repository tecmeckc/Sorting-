package DSA_J;

import java.util.HashMap;
import java.util.Map;

public class Maps {
  public static void main(String[] args) {
    Map<Integer, String> hp = new HashMap<Integer, String>();
    // Input and output operations on the map
    hp.put(2, "abc");
    hp.put(3, "def");
    hp.put(4, "ghi");
    hp.put(5, "jkl");
    hp.put(6, "mno");
    hp.put(7, "pqrs");
    hp.put(8, "tuv");
    hp.put(9, "wxyz");
    System.out.println(hp.get(7));
    System.out.println(hp.remove(8));
    System.out.println(hp);
    // Iterating through your map
    // for (Map.Entry m : hp.entrySet()) {
    // System.out.println(m.getKey() + " "+m.getValue());
    // }
    // System.out.println(hp.containsKey(8));
  }

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
    int[] ans = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int comp = target - nums[i];
      if (mpp.containsKey(comp)) {
        ans[0] = mpp.get(comp);
        ans[1] = i;
        break;
      } else {
        mpp.put(nums[i], i);
      }
    }
    return ans;
  }
}
