package com.example.algorithm.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author zora
 * @Date 17:44 2020/11/19
 * @Description:
 * @Modified By
 */
public class LRULinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRULinkedHashMap(int capacity) {
        // accessOrder: true，所有的Entry按照访问的顺序排列
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    /**
     * 根据Key拿到Value,会把访问的数据移到链表的尾部
     * @param key
     * @return
     */
    @Override
    public V get(Object key)
    {
        synchronized (LRULinkedHashMap.class){
            return super.get(key);
        }
    }

    @Override
    public V put(K key, V value)
    {
        synchronized (LRULinkedHashMap.class){
            return super.put(key, value);
        }
    }
}
