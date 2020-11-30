package com.example.algorithm.math;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 13:25 2020/11/22
 * @Description:
 * @Modified By
 */
class PalindromeTest extends AlgorithmApplicationTests {
    @Autowired
    private Palindrome palindrome;

    @Test
    public void testIsPalindrome(){
        Assert.assertSame("解答错误", false, palindrome.isPalindrome(10));
    }
    @Test
    public void testTwo(){
        Assert.assertSame("解答错误", true, palindrome.two(12321));
    }

}