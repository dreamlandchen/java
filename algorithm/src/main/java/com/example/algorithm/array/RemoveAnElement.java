package com.example.algorithm.array;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 16:53 2020/11/21
 * @Description: 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *               不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *               元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *               示例 2:
 *                  给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 *                  函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 *                  注意这五个元素可为任意顺序。
 *                  你不需要考虑数组中超出新长度后面的元素。
 */
@Component
public class RemoveAnElement {
    /**
     * 113 / 113 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 37.1 MB
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int total = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == val){
                ++total;
            }else {
                nums[i - total] = nums[i];
            }
        }
        for(int index = 0; index < nums.length; index++){
            System.out.print(","+nums[index]);
        }
        return len - total;
    }
}
