package com.example.algorithm.lru;

import java.util.HashMap;

/**
 * @Author zora
 * @Date 17:53 2020/11/18
 * @Description: lru 的链表结构
 * @Modified By
 */
public class LRU <K,V> {
    private Node first;
    private Node last;
    private int capacity;
    private HashMap<K, Node> nodes;

    public LRU(int size){
        this.capacity = size;
        this.nodes = new HashMap(size);
    }

    /**
     * 往列表里插入节点： 头插法
     * @param key
     * @param value
     */
    public void headInsert(K key, V value){
        Node node = nodes.get(key);
        if (node == null){
            if (nodes.size() >= capacity){
                removeLast();
            }
            node = new Node(key, value);
        }else {
            node.value = value;
        }
        moveToHead(node);
        nodes.put(key, node);
    }

    public void moveToHead(Node node){
        if(first == null || last == null){
            first = last = node;
            return;
        }
        if (first == node){
            return;
        }
        if (node.next != null){
            node.next.prev = node.prev;
        }
        if (node.prev != null){
            node.prev.next = node.next;
        }
        if(last == node){
            last = last.prev;
        }
        node.next = first;
        first.prev = node;
        first = node;
        first.prev = null;
    }

    /**
     * 移除最后一个节点
     */
    public void removeLast(){
        nodes.remove(last.key);
        if(last == null){
            return;
        }
        last = last.prev;
        if(last == null){
            first = null;
        }else {
            last.next = null;
        }
    }

    public void clear(){
        first = null;
        last = null;
        nodes.clear();
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        Node node = first;
        while (node != null){
            list.append("," + node.key);
            node = node.next;
        }
        return list.toString().substring(1);
    }
}
