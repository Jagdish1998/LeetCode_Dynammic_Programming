class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 1) return 1;
        int[] dp = new int[len];
        dp[0] = 1;
        int ans = 0;
        for(int i=1; i<len; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
            if(dp[i] > ans) ans = dp[i];
        }
        
        return ans;
    }
}