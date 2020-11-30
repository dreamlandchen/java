package com.example.algorithm.stack;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 19:23 2020/11/26
 * @Description:
 * @Modified By
 */
class ValidParenthesesTest extends AlgorithmApplicationTests {
    @Autowired
    private ValidParentheses validParentheses;

    @Test
    public void testOne(){
        Assert.assertSame("解答错误", true, validParentheses.one("()[]{}"));
    }

    @Test
    public void testTwo(){
        Assert.assertSame("解答错误", true, validParentheses.two("()[]{}"));
    }

}