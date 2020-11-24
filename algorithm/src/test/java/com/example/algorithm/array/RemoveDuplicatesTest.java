package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 19:05 2020/11/24
 * @Description:
 * @Modified By
 */
class RemoveDuplicatesTest extends AlgorithmApplicationTests {
    @Autowired
    private RemoveDuplicates removeDuplicates;

    @Test
    public void testDeduplicationSimple(){
        int[] nums = new int[]{-1,0,0,0,0,3,3};
        Assert.assertSame("解答错误", 3, removeDuplicates.deduplicationSimple(nums));
    }

}