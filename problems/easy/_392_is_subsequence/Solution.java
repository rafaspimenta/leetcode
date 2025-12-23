/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
 * the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */

package problems.easy._392_is_subsequence;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        System.out.println(solution.isSubsequence("", "ahbgdc"));
        System.out.println(solution.isSubsequence("abc", "ahbgdc"));
        System.out.println(!solution.isSubsequence("axc", "ahbgdc")); //false
        System.out.println(solution.isSubsequence("axc", "axc"));
        System.out.println(solution.isSubsequence("", ""));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.equals(t)) return true;

        var sLength = s.length();
        var tLength = t.length();

        if (sLength > tLength) return false;
        if (sLength == 0) return true;

        int sPos = 0;
        for (int i = 0; i < tLength; i++) {
            if (sPos == sLength) return true;

            if (t.charAt(i) == s.charAt(sPos)) {
                sPos++;
            }
        }

        return sPos == sLength;
    }
}