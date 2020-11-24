package com.example.algorithm.array;


/**
 * @Author zora
 * @Date 15:30 2020/11/19
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *               必须在原数组上操作，不能拷贝额外的数组。
 *               尽量减少操作次数。
 *               输入: [0,1,0,3,12]
 *               输出: [1,3,12,0,0]
 * @Modified By
 */
public class MoveZeroesToEnd {
    /**
     * 从后往前数0，移动后面的数组
     * @param nums
     */
    public void moveZero(int[] nums) {
        int len = nums.length - 1;
        int last = len;
        for(int i = len; i >= 0; i--){
            if(nums[i] == 0){
                for(int j = i; j < len; j++){
                    nums[j] = nums[j+1];
                }
                nums[last] = 0;
                last = last - 1;
            }
        }
    }

    /**
     * 从前往后数0，遇0累加，非0数字往前挪0的累加值位
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int count = 0;
        int len = nums.length;
        for(int i = 0;  i < len ; i++){
            if(nums[i] == 0){
                ++count;
            }else {
                nums[i-count] = nums[i];
            }

        }
        for(int j = len - count; j < len; j ++){
            nums[j] = 0;
        }
    }
}
