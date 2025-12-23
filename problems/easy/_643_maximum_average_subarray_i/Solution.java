/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However,
 * flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and
 * false otherwise.
 */

package problems.easy._643_maximum_average_subarray_i;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        System.out.println(solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(solution.findMaxAverage(new int[]{5}, 1));
    }

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) return nums[0];

        var left = 0;
        var windowSum = 0;
        double maxSum = Double.NEGATIVE_INFINITY;

        for (int right = 0; right < nums.length; right++) {
            // expand window
            windowSum += nums[right];

            // validate window meet constraint
            if ((right + 1) - left == k) {
                // record window
                if (windowSum > maxSum) {
                    maxSum = windowSum;
                }

                // shrink window
                windowSum -= nums[left];

                // slide window forward
                left++;
            }
        }

        return maxSum / k;
    }
}