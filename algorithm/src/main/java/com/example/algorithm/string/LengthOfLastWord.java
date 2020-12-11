package com.example.algorithm.string;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 19:59 2020/12/03
 * @Description: 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，
 * 那么最后一个单词就是最后出现的单词。如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 * @Modified By
 */
@Component
public class LengthOfLastWord {
    /**
     * 58 / 58 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.5 MB
     * @param s
     * @return
     */
    public int one(String s) {
        int end = s.length() -1;
        while (end >= 0 && s.charAt(end) == ' '){
            --end;
        }
        if(end < 0){
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            --start;
        }
        return end - start;
    }

    /**
     * 58 / 58 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.7 MB
     * @param s
     * @return
     */
    public int two(String s){
        if(s == null || s.length() == 0) return 0;
        s = s.trim();
        int len = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                break;
            }
            ++len;
        }
        return len;
    }
}
