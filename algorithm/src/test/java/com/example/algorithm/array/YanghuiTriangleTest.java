package com.example.algorithm.array;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 20:35 2020/12/06
 * @Description:
 * @Modified By
 */
class YanghuiTriangleTest extends AlgorithmApplicationTests {
    @Autowired
    private YanghuiTriangle yanghuiTriangle;

    @Test
    public void testOne(){
        int numRows = 5;
        Integer[][] a= {{1},
                        {1, 1},
                        {1, 2, 1},
                        {1, 3, 3, 1},
                        {1, 4, 6, 4, 1},
                        {1, 5, 10, 10, 5, 1}};
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(Arrays.asList(a[i]));
        }
        Assert.assertEquals("解答错误", list, yanghuiTriangle.one(numRows));
    }

}