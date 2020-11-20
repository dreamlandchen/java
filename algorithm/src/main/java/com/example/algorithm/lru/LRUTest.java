package com.example.algorithm.lru;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zora
 * @Date 11:55 2020/11/19
 * @Description:
 * @Modified By
 */
public class LRUTest {
//    private static int POOL_NUM = 10; //线程池数量
//    int[] array = new int[]{1,3,2,7,2,4,9,2,5,7,6,2,1,8,9,2,6,1,3,2};
    
    public static void main(String[] args){
        LRULinkedHashMap<Integer, String> lru = new LRULinkedHashMap<>(4);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lru.put(1, "1");
                System.out.println(lru);
                lru.put(2, "2");
                System.out.println(lru);
                lru.get(4);
                System.out.println(lru);
                lru.put(3, "3");
                System.out.println(lru);
                lru.get(2);
                lru.put(4,"4");
                System.out.println(lru);
                lru.put(5,"5");
                System.out.println(lru);
                lru.put(6,"6");
                System.out.println(lru);
                lru.get(1);
                System.out.println(lru);
                lru.get(5);
                lru.put(6, "6");
                System.out.println(lru);
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lru.put(1,"11");
                System.out.println(lru);
                lru.put(2, "22");
                System.out.println(lru);
                lru.put(3, "33");
                System.out.println(lru);
                lru.get(1);
                System.out.println(lru);
                lru.put(4,"44");
                System.out.println(lru);
            }
        });
        thread.start();
        thread1.start();
    }
//    /**
//     * @param args
//     * @throws InterruptedException
//     */
//    public static void main(String[] args) throws InterruptedException {
//
//        // TODO Auto-generated method stub
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for(int i = 0; i<POOL_NUM; i++) {
//            RunnableThread thread = new RunnableThread();
//            //Thread.sleep(1000);
//            executorService.execute(thread);
//        }
//        //关闭线程池
//        executorService.shutdown();
//    }


}
