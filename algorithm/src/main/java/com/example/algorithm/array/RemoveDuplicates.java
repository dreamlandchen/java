package com.example.algorithm.array;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 18:20 2020/11/24
 * @Description: 给定一个"排序数组"，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *               不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *               给定 nums = [0,1,1,1,2,2,3,3,4,4],
 *               函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *               你不需要考虑数组中超出新长度后面的元素。
 * @Modified By
 */
@Component
public class RemoveDuplicates {
    /**
     * 161 / 161 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 40.4 MB
     * @param nums
     * @return
     */
    public int deduplicationSimple(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        for(int index = 0; index < nums.length; index++){
            System.out.print(","+nums[index]);
        }
        return i+1;
    }

    /**
     * 执行用时：0 ms
     * 内存消耗：40.5 MB
     * @param nums
     * @return
     */
    public int deduplicationBetter(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        for(int index = 0; index < nums.length; index++){
            System.out.print(","+nums[index]);
        }
        return i+1;
    }


}
