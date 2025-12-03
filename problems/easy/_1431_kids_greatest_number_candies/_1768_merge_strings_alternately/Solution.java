/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number
 * of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * Note that multiple kids can have the greatest number of candies.
 */

package problems.easy._1431_kids_greatest_number_candies._1768_merge_strings_alternately;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        System.out.println(solution.kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
        System.out.println(solution.kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}