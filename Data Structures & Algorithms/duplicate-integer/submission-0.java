class Solution {
    public boolean hasDuplicate(int[] nums) {


        Set<Integer> numset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!numset.add(nums[i])){
                return true;
            }
            }
        return false;
    }
}