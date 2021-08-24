package com.hzf.leetTopic._746;

/**
 * @Author 2efeng
 * @Date 2021/8/24
 */

/**
 * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值cost[i]（下标从 0 开始）。
 * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
 * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
 * <p>
 * 示例1：
 * 输入：cost = [10, 15, 20]
 * 输出：15
 * 解释：最低花费是从 cost[1] 开始，然后走两步即可到阶梯顶，一共花费 15 。
 * <p>
 * 示例 2：
 * 输入：cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * 输出：6
 * 解释：最低花费方式是从 cost[0] 开始，逐个经过那些 1 ，跳过 cost[3] ，一共花费 6 。
 * <p>
 * 提示：
 * cost的长度范围是 [2, 1000]。
 * cost[i] 将会是一个整型数据，范围为[0, 999] 。
 * <p>
 * 链接：https://leetcode-cn.com/problems/min-cost-climbing-stairs
 */
public class Solution {

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(new Solution().minCostClimbingStairs(cost));
    }


    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) return Math.min(cost[0], cost[1]);
        if (cost.length == 3) return Math.min(cost[0] + cost[2], cost[1]);
        int[] cahce = new int[cost.length];
        int a = cost[0] + Math.min(climb(cost, 1, cahce), climb(cost, 2, cahce));
        int b = cost[1] + Math.min(climb(cost, 2, cahce), climb(cost, 3, cahce));
        return Math.min(a, b);
    }

    private int climb(int[] cost, int curr, int[] cahce) {
        if (cost.length - curr == 1) return cost[curr];
        if (cost.length - curr == 2) return cost[curr];
        if (cahce[curr] == 0){
            cahce[curr] = cost[curr] + Math.min(climb(cost, curr + 1,cahce), climb(cost, curr + 2,cahce));
        }
        return cahce[curr];
    }
}
