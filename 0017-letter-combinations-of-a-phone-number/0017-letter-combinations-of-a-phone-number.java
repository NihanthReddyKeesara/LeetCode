class Solution {
    public List<String> letterCombinations(String digits) {
         String[] mappings = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        // Result list to store all combinations
        List<String> result = new ArrayList<>();
        
        // If the input is empty, return the empty result list
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        // Start with an empty combination
        result.add("");

        // Loop through each digit in the input string
        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);
            String letters = mappings[digit - '0'];

            // Temporary list to store new combinations
            List<String> tempResult = new ArrayList<>();

            // Loop through each letter corresponding to the current digit
            for (char letter : letters.toCharArray()) {
                // Loop through each combination in the current result
                for (String combination : result) {
                    // Add the new combination to the temporary result list
                    tempResult.add(combination + letter);
                }
            }

            
            result = tempResult;
        }

        
        return result;
    }
}