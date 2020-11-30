package com.example.algorithm.stack;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author zora
 * @Date 18:05 2020/11/26
 * @Description:  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *                有效字符串需满足:
 *                      左括号必须用相同类型的右括号闭合。
 *                      左括号必须以正确的顺序闭合。
 *                      注意空字符串可被认为是有效字符串。
 *                 示例 2:
 *                      输入: "()[]{}"
 *                      输出: true
 *                 示例 5:
 *                      输入: "{[]}"
 *                      输出: true
 * @Modified By
 */
@Component
public class ValidParentheses {
    /**
     * 91 / 91 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 36.5 MB
     * @param s
     * @return
     */
    public boolean one(String s){
        if(s.length() % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char str : s.toCharArray()){
            if(str == '('){
                stack.push(')');
            }else if(str == '['){
                stack.push(']');
            }else if(str == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || str != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * 91 / 91 个通过测试用例
     * 状态：通过
     * 执行用时: 3 ms
     * 内存消耗: 36.5 MB
     * @param s
     * @return
     */
    public boolean two(String s){
        if(s.length() % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && (stack.peek() + 1 == c || stack.peek() + 2 == c)){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    /**
     * 91 / 91 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 36.6 MB
     * @param s
     * @return
     */
    public boolean three(String s){
        int n = s.length();
        if(n % 2 == 1){
            return false;
        }
        Map<Character, Character>  dict = new HashMap(){
            {
                put(')','(');
                put(']', '[');
                put('}', '{');
            }
        };
        Deque<Character> stack = new LinkedList<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(dict.containsKey(ch)){
                if(stack.isEmpty() || stack.peek() != dict.get(ch)){
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

}

