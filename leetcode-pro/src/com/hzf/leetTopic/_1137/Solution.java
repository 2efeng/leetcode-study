package com.hzf.leetTopic._1137;

/**
 * @author 2efeng
 * @date 2021-08-23 23:01
 */

/**
 * 泰波那契序列 Tn 定义如下：
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 *
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。

 *
 * 示例 1：
 *
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 * 示例 2：
 *
 * 输入：n = 25
 * 输出：1389537
 *
 * 提示：
 *
 * 0 <= n <= 37
 * 答案保证是一个 32 位整数，即answer <= 2^31 - 1。
 *
 * 链接：https://leetcode-cn.com/problems/n-th-tribonacci-number
 */

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        for (int i = 0; i <= 10; i++) {
            System.out.println(solution.tribonacci(i));
        }
    }

    public int tribonacci(int n) {
        int[] cache = new int[n+1];
        return fib(n,cache);
    }

    private int fib(int n,int[] cache){
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (cache[n] == 0) {
            cache[n] = fib(n - 3,cache) + fib(n - 2,cache)+ fib(n - 1,cache);
        }
        return cache[n];
    }
}
