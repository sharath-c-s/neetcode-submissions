class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while(true){
            if(index >= strs[0].length()) break;
            char charToCompare = strs[0].charAt(index) ;
            for (String str: strs) {
                if(index >= str.length()) return result.toString();
                if(str.charAt(index) != charToCompare ) return result.toString();
            }
            index++;
            System.out.println(result.toString());
            result.append(charToCompare);
        }
        return result.toString();
        
    }
}