package com.example.algorithm.lru;

/**
 * @Author zora
 * @Date 19:01 2020/11/19
 * @Description:
 * @Modified By
 */
public class RunnableThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("通过线程池方式创建的线程：" + Thread.currentThread().getName() + " ");
    }
}
