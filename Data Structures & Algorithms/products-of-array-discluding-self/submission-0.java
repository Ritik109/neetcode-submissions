class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        // calculate prefix product
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;
        // calculate suffix product
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;

            suffix = suffix * nums[i];
        }
        return result;
    }
}
