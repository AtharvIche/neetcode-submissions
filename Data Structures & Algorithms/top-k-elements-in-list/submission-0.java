class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        int[] ans = new int[k];

        for(int j = 0; j < k; j++){
        int highestFrequ = 0;
        int highestOcc = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > highestFrequ){
                highestFrequ = entry.getValue();
                highestOcc = entry.getKey();
            }
        }

        ans[j] = highestOcc;
        map.remove(highestOcc);
    }

    return ans;
    }
}
