package com.example.algorithm.string;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 11:32 2020/11/30
 * @Description:
 * @Modified By
 */
class LongestCommonPrefixTest extends AlgorithmApplicationTests {
    @Autowired
    private LongestCommonPrefix longestCommonPrefix;

    @Test
    public void testOne(){
        String[] strs = new String[]{"dog","racecar","car"};
        Assert.assertEquals("解答错误", "", longestCommonPrefix.four(strs));
    }

}