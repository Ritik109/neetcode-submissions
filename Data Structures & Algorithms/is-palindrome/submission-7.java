class Solution {
    public boolean isPalindrome(String s) {
        if(s.isBlank()) return true;

        char[] charArray = s.toLowerCase().replaceAll("[#$!.,';:?]", "")
                .replace(" ","")
                .toCharArray();
        if (charArray.length==0) return true;
        int start = 0;
        int end = charArray.length-1;
        while (start<=end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
        
    }
}
