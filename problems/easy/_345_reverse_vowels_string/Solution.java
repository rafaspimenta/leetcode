/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 **/

package problems.easy._345_reverse_vowels_string;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        System.out.println(solution.reverseVowels("IceCreAm").equals("AceCreIm"));
        System.out.println(solution.reverseVowels("leetcode").equals("leotcede"));
        System.out.println(solution.reverseVowels("lala").equals("lala"));
    }

    public String reverseVowels(String s) {
        char[] sChars = s.toCharArray();
        final String vowels = "aeiouAEIOU";

        var left = 0;
        var right = sChars.length - 1;

        while (left < right) {
            while (left < right && vowels.indexOf(sChars[left]) < 0) {
                left++;
            }

            while (right > left && vowels.indexOf(sChars[right]) < 0) {
                right--;
            }

            var temp = sChars[left];
            sChars[left] = sChars[right];
            sChars[right] = temp;

            left++;
            right--;
        }

        return new String(sChars);
    }
}