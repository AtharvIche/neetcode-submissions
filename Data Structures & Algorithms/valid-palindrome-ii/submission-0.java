class Solution {
    public boolean validPalindrome(String s) {
        int st = 0;
        int e = s.length()-1;
        int count = 0;
        while(st < e){
            if(s.charAt(st) == s.charAt(e)){
                st++;
                e--;
            }else{
                return helper(s,st+1,e) || helper(s,st,e-1);
            }
        }
        return true;
    }
    static boolean helper(String s,int l,int r){
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }

        return true;
    }
}