package com.example.algorithm.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 16:50 2020/11/22
 * @Description: 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *               示例 1:
 *                  输入: 121
 *                  输出: true
 *              示例 2:
 *                  输入: -121
 *                  输出: false
 *                  解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *              示例 3:
 *                  输入: 10
 *                  输出: false
 *                  解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * @Modified By
 */
@Component
public class Palindrome {
    @Autowired
    private IntReverse intReverse;

    /**
     * 11510 / 11510 个通过测试用例
     * 状态：通过
     * 执行用时: 10 ms
     * 内存消耗: 37.8 MB
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(0 < x && x < 10){
            return true;
        }
        int reverse = intReverse.two(x);
        if(x == reverse){
            return true;
        }
        return false;
    }

    /**
     * 11510 / 11510 个通过测试用例
     * 状态：通过
     * 执行用时: 9 ms
     * 内存消耗: 37.6 MB
     * @param x
     * @return
     */
    public boolean two(int x){
        if(x == 0){
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int half = 0;
        while (x > half){
            half = half * 10 + x % 10;
            x /= 10;
        }
        // 输入的整数 偶数/奇数
        return x == half || x == half / 10;
    }
}
