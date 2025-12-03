/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t
 * (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */

package problems.easy._1071_greatest_common_divisor_strings;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        System.out.println(solution.gcdOfStrings1("ABCABC", "ABC").equals("ABC"));
        System.out.println(solution.gcdOfStrings1("ABCABC", "CCC").isEmpty());
        System.out.println(solution.gcdOfStrings1("ABCABCABC", "ABCABC").equals("ABC"));
        System.out.println(solution.gcdOfStrings1("A", "AA").equals("A"));
        System.out.println(solution.gcdOfStrings1("AAAAAA", "AA").equals("AA"));
        System.out.println(solution.gcdOfStrings1("AAAAAA", "AAAAA").equals("A"));
        System.out.println(solution.gcdOfStrings1("ABC", "DEF").isEmpty());
    }

    public String gcdOfStrings1(String str1, String str2) {
        //fail first
        if (!(str1 + str2).equals(str2 + str1)) return "";

        String shorter = str1.length() < str2.length() ? str1 : str2;
        int shorterLength = shorter.length();
        String longer = shorter.equals(str1) ? str2 : str1;
        int longerLength = longer.length();

        var gcd = getGCD(longerLength, shorterLength);

        return shorter.substring(0, gcd);
    }

    private int getGCD(int divided, int divisor) {
        while (divisor != 0) {
            int remainer = divided % divisor;

            divided = divisor;
            divisor = remainer;
        }

        return divided;
    }
}