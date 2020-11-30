package com.example.algorithm.string;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 18:02 2020/11/30
 * @Description: 给定一个 haystack 字符串和一个 needle 字符串，在 haystack
 *               字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *               ps: 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *                  对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *               示例：
 *                  输入: haystack = "hello", needle = "ll"
 *                  输出: 2
 * @Modified By
 */
@Component
public class SubstringInString {
    /**
     * 78 / 78 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 36.9 MB
     * @param haystack
     * @param needle
     * @return
     */
    public int one(String haystack, String needle){
        int subLen = needle.length();
        if(subLen == 0){
            return 0;
        }
        int len = haystack.length();
        if(subLen > len){
            return -1;
        }
        int current = 0;
        for(int i = 0; i < len - subLen + 1; i++){
            for(int j = 0; j < subLen; j++){
                if(haystack.charAt(current) == needle.charAt(j)){
                    ++current;
                }else {
                    current = i + 1;
                    break;
                }
                if(j == subLen - 1){
                    return i;
                }
            }
        }
        return -1;
    }
}
