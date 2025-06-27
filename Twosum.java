import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(current, i);
        }
        return new int[0];
    }
        public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}
