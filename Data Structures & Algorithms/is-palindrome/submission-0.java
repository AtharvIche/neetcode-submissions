class Solution {
    public boolean isPalindrome(String s) {
        
     String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

     for(int i = 0; i < clean.length()/2; i++){
        if(clean.charAt(i) != clean.charAt(clean.length()-i-1)){
            return false;
        }

     }

     return true;
    }
}
