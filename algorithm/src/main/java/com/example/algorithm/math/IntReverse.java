package com.example.algorithm.math;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 15:21 2020/11/27
 * @Description:  给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *                 示例 1: 输入: 123 输出: 321
 *                 示例 2: 输入: -123 输出: -321
 *                 示例 2: 输入: 120 输出: 21
 *                 注意：假设我们的环境只能存储得下 32 位的有符号整数，
 *                      则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @Modified By
 */
@Component
public class IntReverse {
    public int one(int x) {
        int reverse = 0;
        while (x != 0){
            int pop = x % 10;
            // 2^31 - 1 = 0x7fffffff
            if(reverse > Integer.MAX_VALUE /10 ||
                    (reverse == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            // -2^31 = 0x80000000
            if(reverse < Integer.MIN_VALUE /10 ||
                    (reverse == Integer.MIN_VALUE /10 && pop < -8)){
                return 0;
            }
            reverse = reverse * 10 + pop;
            x /= 10;
        }
        return reverse;
    }

    public int two(int x){
        if(-10 < x && x < 10){
            return x;
        }
        int reverse = 0;
        while (x != 0){
            int pop = x % 10;
            if(reverse > Integer.MAX_VALUE /10 ||
                    (reverse == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            if(reverse < Integer.MIN_VALUE /10 ||
                    (reverse == Integer.MIN_VALUE /10 && pop < -8)){
                return 0;
            }
            reverse = reverse * 10 + pop;
            x /= 10;
        }
        return reverse;
    }

}
