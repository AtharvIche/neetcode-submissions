class Solution {
    public int majorityElement(int[] nums) {
        int candi = nums[0];
        int count = 0;

        for(int i : nums){
            if(i == candi){
                count++;
            }else{
                count--;
                if(count == 0){
                    candi = i;
                    count++;
                }
            }
        }

        return candi;
    }
}