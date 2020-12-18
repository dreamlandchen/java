package com.example.algorithm.string;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 11:20 2020/12/17
 * @Description:
 * @Modified By
 */
class BinarySummationTest extends AlgorithmApplicationTests {
    @Autowired
    private BinarySummation binarySummation;

    @Test
    void one() {
        Assert.assertEquals("解答错误", "100", binarySummation.one("11", "1"));
    }

    @Test
    void two() {
        Assert.assertEquals("解答错误", "100", binarySummation.two("11", "1"));
    }
}