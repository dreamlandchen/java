package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 19:46 2020/12/02
 * @Description:
 * @Modified By
 */
class MaxProfitTest extends AlgorithmApplicationTests {
    @Autowired
    private MaxProfit maxProfit;

    @Test
    public void testOne(){
        int[] prices = new int[]{1,2,4};
//        int[] prices = new int[]{2,4,1};
//        int[] prices = new int[]{3,2,6,5,0,3};
        Assert.assertSame("解答错误", 3, maxProfit.one(prices));
    }

    @Test
    public void testThree(){
//        int[] prices = new int[]{1,2,4};
//        int[] prices = new int[]{2,4,1};
        int[] prices = new int[]{3,2,6,5,0,3};
        Assert.assertSame("解答错误", 4, maxProfit.three(prices));
    }

    @Test
    public void testFour(){
//        int[] prices = new int[]{1,2,4};
        int[] prices = new int[]{2,4,1};
//        int[] prices = new int[]{3,2,6,5,0,3};
        Assert.assertSame("解答错误", 2, maxProfit.four(prices));
    }

    @Test
    public void testFive(){
        int[] prices = new int[]{1,2};
//        int[] prices = new int[]{2,4,1};
//        int[] prices = new int[]{3,2,6,5,0,3};
        Assert.assertSame("解答错误", 1, maxProfit.five(prices));
    }
}