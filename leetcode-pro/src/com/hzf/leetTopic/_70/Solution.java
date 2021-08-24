package com.hzf.leetTopic._70;

/**
 * @Author 2efeng
 * @Date 2021/8/24
 */

/**
 * 假设你正在爬楼梯。需要 n阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * <p>
 * 示例 2：
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(10));
    }

    public int climbStairs(int n) {
        int[] cache = new int[n];
        return climb(n, cache);
    }

    private int climb(int n, int[] cache) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (cache[n - 1] == 0) {
            cache[n - 1] = climb(n - 1, cache) + climb(n - 2, cache);
        }
        return cache[n - 1];
    }
}
