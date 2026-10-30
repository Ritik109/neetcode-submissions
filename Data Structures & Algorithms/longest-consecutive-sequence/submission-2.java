class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }

        int longestStreak = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentSteak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentSteak++;
                }
                if (longestStreak < currentSteak)
                    longestStreak = currentSteak;
            }
        }

        return longestStreak;
    }
}
