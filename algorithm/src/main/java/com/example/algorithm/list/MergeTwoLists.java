package com.example.algorithm.list;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author zora
 * @Date 19:21 2020/11/30
 * @Description: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *               示例：
 *                  输入：1->2->4, 1->3->4
*                   输出：1->1->2->3->4->4
 * @Modified By
 */
@Component
public class MergeTwoLists {

    /**
     * 208 / 208 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 37.9 MB
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode one(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
