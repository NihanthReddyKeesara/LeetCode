class Solution {
    public String[] findWords(String[] words) {
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();

        // Populate the sets for each row
        for (char c : row1.toCharArray()) set1.add(c);
        for (char c : row2.toCharArray()) set2.add(c);
        for (char c : row3.toCharArray()) set3.add(c);

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (canTypedWithinOneRow(word.toLowerCase(), set1, set2, set3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }

    public boolean canTypedWithinOneRow(String word, Set<Character> set1, Set<Character> set2, Set<Character> set3) {
        Set<Character> setToUse = new HashSet<>();
        char firstChar = word.charAt(0);

        // Determine which set to use based on the first character
        if (set1.contains(firstChar)) {
            setToUse = set1;
        } else if (set2.contains(firstChar)) {
            setToUse = set2;
        } else if (set3.contains(firstChar)) {
            setToUse = set3;
        } else {
            return false; // Edge case: if first character not in any set
        }

        // Check if all characters in the word belong to the chosen set
        for (char c : word.toCharArray()) {
            if (!setToUse.contains(c)) {
                return false;
            }
        }

        return true;
    }

    
}