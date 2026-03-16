import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            if (mapa.containsKey(complemento)) {

                return new int[] { mapa.get(complemento), i };
            }

            mapa.put(nums[i], i);
        }
        return new int[] {};
    }
}
