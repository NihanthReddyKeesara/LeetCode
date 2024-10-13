class Solution {
    public String longestCommonPrefix(String[] arr) {
         if (arr == null || arr.length == 0) {
            return "";
        }

        // Initialize StringBuilder to store the result
        StringBuilder res = new StringBuilder();
        
        // Loop through characters of the first string
        for (int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);
            
            // Compare with characters of other strings
            for (int j = 1; j < arr.length; j++) {
                // If the current index exceeds the length of any string or characters do not match
                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    return res.toString();  // Return the result
                }
            }
            
            // If character matches in all strings, append it to the result
            res.append(ch);
        }
        
        return res.toString(); 
    }
}