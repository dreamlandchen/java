package com.example.algorithm.array;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zora
 * @Date 19:44 2020/12/06
 * @Description:  pascal triangle:给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 示例:
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * @Modified By
 */
@Component
public class YanghuiTriangle {
    /**
     * 15 / 15 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 36.7 MB
     * @param numRows
     * @return
     */
    public List<List<Integer>> one(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows <= 0){
            return list;
        }
        for(int i = 0; i < numRows; ++i){
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j){
                if(j == 0 || j == i){
                    row.add(1);
                }else {
                    row.add(list.get(i-1).get(j -1) + list.get(i-1).get(j));
                }
            }
            list.add(row);
        }
        return list;
    }
}
