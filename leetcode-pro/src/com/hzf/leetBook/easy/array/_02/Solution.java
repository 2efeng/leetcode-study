package com.hzf.leetBook.easy.array._02;

import java.util.Arrays;

/**
 * @Author 2efeng
 * @Date 2021/8/24
 * <p>
 * 买卖股票的最佳时机 II
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 */
public class Solution {

    public static void main(String[] args) {
        int[] prices = {6, 1, 3, 2, 4, 7};
        System.out.println(new Solution().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (diff > 0) total += diff;
        }
        return total;
    }

    public int maxProfit1(int[] prices) {
        int buy = -1;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                if (buy != -1) {
                    max = max + prices[i - 1] - buy;
                    buy = -1;
                }
            } else {
                if (buy == -1) {
                    buy = prices[i - 1];
                }
                if (prices.length == i + 1) {
                    max = max + prices[i] - buy;
                }
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {

        if (prices == null || prices.length < 2)
            return 0;

        int total = 0;
        int index = 0;
        int length = prices.length;

        while (index < length) {
            //如果股票下跌就一直找，直到找到股票开始上涨为止
            while (index < length - 1 && prices[index] >= prices[index + 1])
                index++;
            //股票上涨开始的值，也就是这段时间上涨的最小值
            int min = prices[index];
            //一直找到股票上涨的最大值为止
            while (index < length - 1 && prices[index] <= prices[index + 1])
                index++;
            //计算这段上涨时间的差值，然后累加
            total += prices[index++] - min;
        }
        return total;
    }



}
