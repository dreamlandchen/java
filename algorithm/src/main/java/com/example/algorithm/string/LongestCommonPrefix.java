package com.example.algorithm.string;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 18:10 2020/11/23
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。
 *               如果不存在公共前缀，返回空字符串 ""。
 *               ps: 所有输入只包含小写字母 a-z 。
 *               示例 1:
 *                  输入: ["flower","flow","flight"]
 *                  输出: "fl"
 * @Modified By
 */
@Component
public class LongestCommonPrefix {
    /**
     * 123 / 123 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.3 MB
     * @param strs
     * @return
     */
    public String two(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            if("".equals(prefix)){
                return prefix;
            }
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    /**
     * 123 / 123 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.5 MB
     * @param strs
     * @return
     */
    public String three(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(String str : strs){
            if("".equals(prefix)){
                return prefix;
            }
            while (!str.startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    /**
     * 123 / 123 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.1 MB
     * @param strs
     * @return
     */
    public String four(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(prefix.length() == 0){
                return prefix;
            }
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
