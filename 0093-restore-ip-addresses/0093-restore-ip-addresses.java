class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private void backtrack(List<String> result, List<String> tempList, String s, int start) {
        if (tempList.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", tempList));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length()) {
                break;
            }
            String segment = s.substring(start, start + i);
            if (isValid(segment)) {
                tempList.add(segment);
                backtrack(result, tempList, s, start + i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    private boolean isValid(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }

}