package com.example.algorithm.array;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 18:19 2020/11/25
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *               你可以假设数组中无重复元素。
 *               示例：
 *                  输入: [1,3,5,6], 0
 *                  输出: 0
 * @Modified By
 */
@Component
public class SearchInsert {
    /**
     * 62 / 62 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 38.4 MB
     * @param nums
     * @param target
     * @return
     */
    public int one(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        int len = nums.length;
        for(int i = 0; i < len ;i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return len;
    }

    /**
     * 62 / 62 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 38.2 MB
     * @param nums
     * @param target
     * @return
     */
    public int two(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int len = nums.length;
        if(target > nums[len - 1]){
            return len;
        }
        if(target <= nums[0]){
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end){
            mid =(start + end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid -1 ;
            }else {
                start = mid + 1;
            }
        }
        if(nums[mid] > target){
            return mid;
        }
        return mid+1;
    }

    /**
     * 62 / 62 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 38.2 MB
     * @param nums
     * @param target
     * @return
     */
    public int three(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        if(target <= nums[0]){
            return 0;
        }
        int len = nums.length;
        if(target > nums[len - 1]){
            return len;
        }
        for(int i = 0; i < len ;i++){
            if(target <= nums[i]){
                return i;
            }
        }
        return len;
    }
}
