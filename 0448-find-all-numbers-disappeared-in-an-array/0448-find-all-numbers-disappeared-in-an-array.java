class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        // Step 1: Mark the indices corresponding to the values as visited
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;  // Get the index corresponding to the value
            if (nums[index] > 0) {
                nums[index] = -nums[index];  // Mark as visited by negating the value
            }
        }
        
        // Step 2: Collect all indices that have positive values
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);  // Missing number is index + 1
            }
        }
        
        return res;
    }
}