package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 18:47 2020/12/05
 * @Description:
 * @Modified By
 */
class CombineTwoOrderedArraysTest extends AlgorithmApplicationTests {
    @Autowired
    private CombineTwoOrderedArrays combineTwoOrderedArrays;

    @Test
    public void testOne(){
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        int m = 3, n = 3;
        int[] result = new int[]{1,2,2,3,5,6};
        Assert.assertArrayEquals("解答错误", result, combineTwoOrderedArrays.one(num1, m, num2, n));
    }

    public void testTwo(){
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        int m = 3, n = 3;
        int[] result = new int[]{1,2,2,3,5,6};
        Assert.assertArrayEquals("解答错误", result, combineTwoOrderedArrays.two(num1, m, num2, n));
    }
}