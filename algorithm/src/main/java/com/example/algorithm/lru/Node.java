package com.example.algorithm.lru;

/**
 * @Author zora
 * @Date 17:47 2020/11/18
 * @Description: 链表的节点
 * @Modified By
 */
public class Node {
    Object key;
    Object value;
    Node prev;
    Node next;
    public Node(Object key, Object value){
        this.key = key;
        this.value = value;
    }
}
