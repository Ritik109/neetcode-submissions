impl Solution {
    pub fn longest_consecutive(nums: Vec<i32>) -> i32 {
        if nums.is_empty() {
            return 0;
        }

        // Insert all elements into a HashSet for O(1) lookups
        let num_set: HashSet<i32> = nums.into_iter().collect();
        let mut longest_streak = 0;

        for &num in &num_set {
            // Check if this number is the start of a sequence
            if !num_set.contains(&(num - 1)) {
                let mut current_num = num;
                let mut current_streak = 1;

                // Count consecutive numbers upwards
                while num_set.contains(&(current_num + 1)) {
                    current_num += 1;
                    current_streak += 1;
                }

                // Update the maximum streak found so far
                longest_streak = std::cmp::max(longest_streak, current_streak);
            }
        }

        longest_streak

    }
}
