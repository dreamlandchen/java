package com.example.algorithm.lru;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @Author zora
 * @Date 11:08 2020/11/19
 * @Description:
 * @Modified By
 */
public class LRUTest {
    @Test
    public void lru(){
        String sequence = "1,3,2,7,2,4,9,2,5,7,6,2,1,8";
        String[] str = sequence.split(",");
        LRU<Integer, String> lru = new LRU<>(8);
        Arrays.stream(str).forEach(
                p -> lru.headInsert(Integer.parseInt(p), p)
        );
        // result：8,1,2,6,7,5,9,4
        System.out.println(lru.toString());
    }
}
