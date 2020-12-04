package com.example.algorithm.array;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 18:12 2020/12/01
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4, -1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶: 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * @Modified By
 */
@Component
public class MaxSubArray {
    /**
     * 202 / 202 个通过测试用例
     * 状态：通过
     * 执行用时: 131 ms
     * 内存消耗: 38.2 MB
     * @param nums
     * @return
     */
    public int one(int[] nums){
        int len = nums.length;
        if(nums == null ||len == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            int tmp = 0;
            for(int j = i; j < len; j++){
                tmp += nums[j];
                if(tmp > max){
                    max = tmp;
                }
            }
        }
        return max;
    }

    /**
     * 202 / 202 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 38.6 MB
     * @param nums
     * @return
     */
    public int two(int[] nums) {
        if(nums == null ||nums.length == 0){
            return 0;
        }
        int tmp = 0, max = nums[0];
        for (int x : nums) {
            tmp = Math.max(tmp + x, x);
            max = Math.max(max, tmp);
        }
        return max;
    }
}
