package com.hzf.leetBook.easy.array._01;

/**
 * @Author 2efeng
 * @Date 2021/8/24
 * <p>
 * 删除排序数组中的重复项
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 */

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int len = new Solution().removeDuplicates(nums);
        System.out.println(len);
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int leftIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[leftIdx] != nums[i]) {
                leftIdx++;
                nums[leftIdx] = nums[i];
            }
        }
        return leftIdx + 1;
    }


}
