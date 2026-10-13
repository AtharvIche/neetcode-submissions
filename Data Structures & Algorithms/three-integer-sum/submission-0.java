class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
            int sum = 0;

            HashSet<Long> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            int tri = sum - nums[i];

            int li = i + 1;
            int ri = nums.length-1;

            while(li < ri){
                if(nums[li] + nums[ri] > tri){
                    ri--;
                }else if(nums[li] + nums[ri] < tri){
                    li++;
                }else{

                    long hash = getHash(nums[i],nums[li],nums[ri]);

                    if(!set.contains(hash)){
                        ans.add(Arrays.asList(nums[i],nums[li],nums[ri]));
                        set.add(hash);
                    }
                    li++;
                    ri--;

                }
            }
        }
        return ans;
    }

    static long getHash(int fi,int sec,int thir){
        long hash = fi;
        hash *= 100000;
        hash += sec;
        hash *= 100000;
        hash += thir;


        return hash;
    }
}
