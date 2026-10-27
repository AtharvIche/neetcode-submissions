class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window = 0;
        int ans = Integer.MAX_VALUE;;

        int left = 0;

        for(int right = 0; right < nums.length; right++){
            window += nums[right];

            while(target <= window){
                ans = Math.min(ans, right-left+1);
                window -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}