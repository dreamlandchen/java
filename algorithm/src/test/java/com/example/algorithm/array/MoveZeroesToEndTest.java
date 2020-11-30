package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 16:20 2020/11/28
 * @Description:
 * @Modified By
 */
class MoveZeroesToEndTest extends AlgorithmApplicationTests {
    @Autowired
    private MoveZeroesToEnd moveZeroesToEnd;

    @Test
    public void testMoveZeroes(){
        int[] nums = new int[]{0,1,0,3,12};
        Assert.assertArrayEquals("解答错误", new int[]{1,3,12,0,0}, moveZeroesToEnd.moveZeroes(nums));
    }

}