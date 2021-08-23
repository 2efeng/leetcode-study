package com.hzf._509;

/**
 * @author 2efeng
 * @date 2021-08-23 22:07
 */

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 * <p>
 * 示例 1：
 * 输入：2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1
 * <p>
 * 示例 2：
 * 输入：3
 * 输出：2
 * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2
 * <p>
 * 示例 3：
 * 输入：4
 * 输出：3
 * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 */

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 1; i <= 10; i++) {
            System.out.println(solution.fib(i));
        }
    }

    public int fib(int n) {
        int[] cache = new int[n + 1];
        return fib_dp(n, cache);
    }

    private int fib_dp(int n, int[] cache) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (cache[n] == 0) {
            cache[n] = fib_dp(n - 2, cache) + fib_dp(n - 1, cache);
        }
        return cache[n];
    }

}
