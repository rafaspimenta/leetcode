/**
 * You are given two strings word1 and word2. Merge the strings by adding
 * letters in alternating order, starting with
 * word1. If a string is longer than the other, append the additional letters
 * onto the end of the merged string.
 * Return the merged string.
 */

package problems.easy._1768_merge_strings_alternately;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        System.out.println(solution.mergeAlternately("abc", "12345"));
        System.out.println(solution.mergeAlternately("abcdef", "123"));
    }

    public String mergeAlternately(String word1, String word2) {
        int minLen = Math.min(word1.length(), word2.length());
        StringBuilder merged = new StringBuilder(word1.length() + word2.length());

        // Merge alternating characters up to the minimum length
        for (int i = 0; i < minLen; i++) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
        }

        // Append remaining characters from the longer string
        if (word1.length() > minLen) {
            merged.append(word1.substring(minLen));
        } else if (word2.length() > minLen) {
            merged.append(word2.substring(minLen));
        }

        return merged.toString();
    }
}