package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 18:30 2020/11/25
 * @Description:
 * @Modified By
 */
class SearchInsertTest extends AlgorithmApplicationTests {
    @Autowired
    private SearchInsert searchInsert;

    @Test
    public void testOne(){
        int[] nums = new int[]{1,3,5,6,8};
        Assert.assertSame("解答错误", 5, searchInsert.one(nums, 9));
    }

    @Test
    public void testTwo(){
        int[] nums = new int[]{1,3};
        Assert.assertSame("解答错误", 1, searchInsert.two(nums, 2));
    }

}