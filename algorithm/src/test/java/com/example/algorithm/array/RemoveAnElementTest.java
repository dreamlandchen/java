package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 19:33 2020/11/21
 * @Description:
 * @Modified By
 */
class RemoveAnElementTest extends AlgorithmApplicationTests {
    @Autowired
    private RemoveAnElement removeAnElement;

    @Test
    public void testRemoveElement(){
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        Assert.assertSame("解答错误", 5, removeAnElement.removeElement(nums, 2));
    }
}