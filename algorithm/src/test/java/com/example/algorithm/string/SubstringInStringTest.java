package com.example.algorithm.string;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 19:05 2020/11/30
 * @Description:
 * @Modified By
 */
class SubstringInStringTest extends AlgorithmApplicationTests {
    @Autowired
    private SubstringInString substringInString;

    @Test
    public void testOne(){
        Assert.assertSame("解答错误", 2, substringInString.one("hello", "ll"));
    }

}