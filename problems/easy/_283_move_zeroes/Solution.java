/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 **/

package problems.easy._283_move_zeroes;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});
        solution.moveZeroes(new int[]{0});
    }

    public void moveZeroes(int[] nums) {
        var write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                int temp = nums[write];
                nums[write] = nums[read];
                nums[read] = temp;
                write++;
            }
        }
    }
}