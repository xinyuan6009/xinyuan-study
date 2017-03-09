package com.xinyuan6009.study.thread;

import com.xinyuan6009.study.ThreadStudy;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.thread
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/8
 * @Version V1.0
 */
public class Hello {

    /**
     * 测试方法
     */
    public static void test(){

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {



        ExecutorService pool = newFixedThreadPool(10);

        for(int i=0;i<8;i++){
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("输出...");
                }
            });
        }

        System.out.println("a");
    }
}
