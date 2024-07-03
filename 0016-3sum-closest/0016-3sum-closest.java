import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Check if this sum is closer to the target than the previous closest
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // Move the left pointer to the right
                } else if (currentSum > target) {
                    right--; // Move the right pointer to the left
                } else {
                    // If currentSum is exactly the target, return it immediately
                    return currentSum;
                }
            }
        }

        return closestSum;
    }
}
