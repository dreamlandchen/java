package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 19:31 2020/12/01
 * @Description:
 * @Modified By
 */
class MaxSubArrayTest extends AlgorithmApplicationTests {
    @Autowired
    private MaxSubArray maxSubArray;

    @Test
    public void testOne(){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Assert.assertSame("解答错误", 6, maxSubArray.one(nums));
    }

}