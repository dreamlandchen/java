package com.example.algorithm.list;

import com.example.algorithm.AlgorithmApplicationTests;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zora
 * @Date 19:45 2020/11/30
 * @Description:
 * @Modified By
 */
class MergeTwoListsTest extends AlgorithmApplicationTests {
    @Autowired
    private MergeTwoLists mergeTwoLists;

    @Test
    public void testOne(){
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        ListNode l1 = new ListNode(1);
        ListNode prev = l1;
        prev.next = two;
//        prev = prev.next;
//        prev.next = four;
        System.out.println(l1);

        ListNode l2 = new ListNode(1);
        prev = l2;
        prev.next = three;
//        prev = prev.next;
//        prev.next = four;
        System.out.println(l2);

        ListNode l3 = new ListNode(1);
        prev = l3;
        prev.next = one;
        prev = prev.next;
        prev.next = two;
        prev = prev.next;
        prev.next = three;
//        prev = prev.next;
//        prev.next = four;
        // StackOverflowError
//        prev = prev.next;
//        prev.next = four;
        System.out.println(l3);

        Assert.assertEquals("解答错误", l3, mergeTwoLists.one(l1, l2));
    }

}