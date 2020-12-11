package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 18:20 2020/12/04
 * @Description:
 * @Modified By
 */
class PlusOneTest extends AlgorithmApplicationTests {
    @Autowired
    private PlusOne plusOne;

    @Test
    public void testOne(){
        int[] digits = new int[]{9,9,9};
        int[] result = new int[]{1,0,0,0};
        Assert.assertArrayEquals("解答错误", result, plusOne.one(digits));
    }

}