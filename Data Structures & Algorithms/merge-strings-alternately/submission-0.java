class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < a && i < b){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

            i++;
        }

        while(i < a){
            sb.append(word1.charAt(i));
            i++;
        }

        while(i < b){
            sb.append(word2.charAt(i));
            i++;
        }


        return sb.toString();
    }
}