package com.example.algorithm.array;

import org.springframework.stereotype.Component;

/**
 * @Author zora
 * @Date 19:16 2020/12/02
 * @Description:给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意：你不能在买入股票前卖出股票。
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * @Modified By
 */
@Component
public class MaxProfit {
    /**
     * 暴利法
     * 200 / 200 个通过测试用例
     * 状态：通过
     * 执行用时: 313 ms
     * 内存消耗: 38.4 MB
     * @param prices
     * @return
     */
    public int one(int[] prices){
        if(prices.length < 2) return 0;
        int len = prices.length;
        int maxProfit = 0;
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                int tmp = prices[j] - prices[i];
                if( tmp > maxProfit){
                    maxProfit = tmp;
                }
            }
        }
        return maxProfit;
    }

    /**
     * 200 / 200 个通过测试用例
     * 状态：通过
     * 执行用时: 381 ms
     * 内存消耗: 38.5 MB
     * @param prices
     * @return
     */
    public int two(int[] prices){
        if(prices.length < 2) return 0;
        int len = prices.length;
        int maxProfit = 0;
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                maxProfit = Math.max(prices[j] - prices[i], maxProfit);
            }
        }
        return maxProfit;
    }

    /**
     * 200 / 200 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 38.4 MB
     * @param prices
     * @return
     */
    public int three(int[] prices){
        if(prices.length < 2) return 0;
        int len = prices.length, maxProfit = 0, tmp = 0, min = 0;
        for(int i = 1; i < len ; ++i){
            min = prices[min] > prices[i] ? i : min;
            tmp = Math.max(prices[i] - prices[min], tmp);
            maxProfit = Math.max(tmp, maxProfit);
        }
        return maxProfit;
    }

    /**
     * 200 / 200 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 38.5 MB
     * @param prices
     * @return
     */
    public int four(int[] prices){
        if(prices.length < 2) return 0;
        int maxProfit = 0, min = prices[0];
        for(int price: prices){
            min = price < min ? price : min;
            maxProfit = Math.max(price - min, maxProfit);
        }
        return maxProfit;
    }

    /**
     * 200 / 200 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 38.5 MB
     * @param prices
     * @return
     */
    public int five(int[] prices){
        if(prices.length < 2) return 0;
        int maxProfit = 0, minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length ; ++i){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    /**
     * 200 / 200 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 38.5 MB
     * @param prices
     * @return
     */
    public int six(int[] prices){
        if(prices.length < 2) return 0;
        int maxProfit = 0, minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length ; ++i){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else {
                maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            }
        }
        return maxProfit;
    }
}
