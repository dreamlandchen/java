package com.example.algorithm.array;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 17:59 2020/12/04
 * @Description:给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 示例 1：
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例 2：
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 * 输入：digits = [0]
 * 输出：[1]
 * 提示：
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * @Modified By
 */
@Component
public class PlusOne {
    /**
     * 114 / 114 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 37.1 MB
     * @param digits
     * @return
     */
    public int[] one(int[] digits) {
        if(digits == null || digits.length < 1 || digits.length > 100) return new int[0];
        for(int i = digits.length - 1; i >= 0; i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    /**
     * 114 / 114 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 37 MB
     * @param digits
     * @return
     */
    public int[] two(int[] digits) {
        if(digits == null || digits.length < 1 || digits.length > 100) return new int[0];
        for(int i = digits.length - 1; i >= 0; i--){
            digits[i]++;
            if (digits[i] == 10){
                digits[i] = 0;
            }else {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
