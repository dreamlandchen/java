package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 20:30 2020/11/20
 * @Description:
 * @Modified By
 */
class SumOfTwoNumTest extends AlgorithmApplicationTests {
    @Autowired
    private SumOfTwoNum sumOfTwoNum;

    @Test
    public void testTwoSumSimple(){
        int[] nums = new int[]{-3,4,3,90};
        int[] expected = new int[]{0,2};
        Assert.assertArrayEquals("解答错误", expected, sumOfTwoNum.twoSumSimple(nums, 0));
    }
}