class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        String[] array = s.split("");
        Map<String, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(array[j])) {
                i = Math.max(map.get(array[j]), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(array[j], j + 1);
        }
        return result;
    }
}
