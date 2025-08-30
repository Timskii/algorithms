package lengthOfLongestSubstring;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        /*Example 1:
        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.*/
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));

        /*Example 2:
        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.*/

        s = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s));

        /* Example 3:
        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

        s = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
