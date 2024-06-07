class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] resArr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            resArr[2 * i] = nums[i];
            resArr[2 * i + 1] = nums[n + i];
        }
        return resArr;
    }
}
