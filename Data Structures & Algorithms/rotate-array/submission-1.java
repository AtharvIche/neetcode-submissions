class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        reverse(nums, 0, n - 1 - k);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);   
    }
    static void reverse(int[] arr, int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }
    }
}