package com.example.algorithm.math;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 15:39 2020/11/27
 * @Description:
 * @Modified By
 */
class IntReverseTest extends AlgorithmApplicationTests {
    @Autowired
    private IntReverse intReverse;

    @Test
    public void testOne(){
        Assert.assertSame("解答错误", 0, intReverse.two(1534236469));
    }

}