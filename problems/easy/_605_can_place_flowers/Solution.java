/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However,
 * flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and
 * false otherwise.
 */

package problems.easy._605_can_place_flowers;

final class Solution {

    private Solution() {
    }

    static void main() {
        Solution solution = new Solution();

        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        System.out.println(solution.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        System.out.println(solution.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return false;

        var newPlanted = 0;
        var flowerbedLength = flowerbed.length;

        for (int i = 0; i < flowerbedLength; i++) {
            if (flowerbed[i] == 1) continue;

            int lastPlot = (i != 0) ? flowerbed[i - 1] : 0;
            int nextPlot = (i != flowerbedLength - 1) ? flowerbed[i + 1] : 0;

            var canPlant = flowerbed[i] == 0 && lastPlot == 0 && nextPlot == 0;
            if (canPlant) {
                flowerbed[i] = 1;
                newPlanted++;
                if (newPlanted >= n) return true;
            }
        }

        return false;
    }
}