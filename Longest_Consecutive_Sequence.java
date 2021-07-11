class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2) return nums.length;
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i : nums){
            map.put(i, true);
        }
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]-1)) map.put(nums[i], false);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == true){
                int num = nums[i], count = 0;
                while(map.containsKey(num)){
                    count++;
                    num++;
                }
                if(count > max) max = count;
            }
        }
        return max;
    }
}