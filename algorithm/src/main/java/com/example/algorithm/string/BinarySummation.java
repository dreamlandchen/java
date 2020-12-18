package com.example.algorithm.string;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 18:28 2020/12/08
 * @Description: 给你两个二进制字符串，返回它们的和（用二进制表示）。输入为 非空 字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 提示：
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 * @Modified By
 */
@Component
public class BinarySummation {
    /**
     * 在 Java 中：
     * 如果字符串超过 3333 位，不能转化为 Integer
     * 如果字符串超过 6565 位，不能转化为 Long
     * 如果字符串超过 500000001500000001 位，不能转化为 BigInteger
     *
     * java.lang.NumberFormatException:
     * For input string: "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101" under radix 2
     * @param a
     * @param b
     * @return
     */
    public String one(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2)+ Integer.parseInt(b, 2));
    }

    /**
     * 294 / 294 个通过测试用例
     * 状态：通过
     * 执行用时: 3 ms
     * 内存消耗: 37 MB
     * @param a
     * @param b
     * @return
     */
    public String two(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int n = Math.max(a.length(), b.length()), carry = 0;
        for(int i = 0; i < n; i++){
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }
}

