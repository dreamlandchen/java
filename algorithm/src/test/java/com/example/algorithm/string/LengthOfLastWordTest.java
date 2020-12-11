package com.example.algorithm.string;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 18:30 2020/12/03
 * @Description:
 * @Modified By
 */
class LengthOfLastWordTest extends AlgorithmApplicationTests {
    @Autowired
    private LengthOfLastWord lengthOfLastWord;

    @Test
    public void testOne(){
        Assert.assertSame("解答错误", 5, lengthOfLastWord.one("Hello World  "));
    }

    @Test
    public void testTwo(){
        Assert.assertSame("解答错误", 5, lengthOfLastWord.two("Hello World  "));
    }

}