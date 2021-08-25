package com.hzf.leetBook.easy.array._03;

/**
 * @Author 2efeng
 * @Date 2021/8/25
 * <p>
 * 旋转数组
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 */
public class Solution {


    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        for (int i = 0; i < nums.length; i++) {
            int currIdx = (i + k) % nums.length;
            nums[currIdx] = temp[i];
        }
    }

}
