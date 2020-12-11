package com.example.algorithm.array;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author zora
 * @Date 18:17 2020/12/05
 * @Description:给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 说明：
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 * 示例：
 * 输入：
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 输出：[1,2,2,3,5,6]
 *  
 * 提示：
 * -10^9 <= nums1[i], nums2[i] <= 10^9
 * nums1.length == m + n
 * nums2.length == n
 * @Modified By
 */
@Component
public class CombineTwoOrderedArrays {
    /**
     * 59 / 59 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 38.7 MB
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return
     */
    public int[] one(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1, j = n -1, k = m + n - 1;
        while (i >= 0 && j >= 0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
        for (int num: nums1){
            System.out.print("," + num);
        }
        return nums1;
    }

    /**
     * 59 / 59 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 38.8 MB
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return
     */
    public int[] two(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        return nums1;
    }
}
