/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of
 * the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long
 * integers.
 */

package problems.easy.mini_max_sum;

import java.util.List;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        solution.miniMaxSum(List.of(1, 0, 0, 0, 1));
        solution.miniMaxSum(List.of(1, 3, 5, 7, 9));
    }

    public static void miniMaxSum(List<Integer> arr) {
        int minValue = arr.getFirst();
        int maxValue = minValue;
        long total = minValue;

        for (int i = 1; i < arr.size(); i++) {
            total += arr.get(i);
            minValue = minValue > arr.get(i) ? arr.get(i) : minValue;
            maxValue = maxValue < arr.get(i) ? arr.get(i) : maxValue;
        }

        System.out.println((total - maxValue) + " " + (total - minValue));
    }
}