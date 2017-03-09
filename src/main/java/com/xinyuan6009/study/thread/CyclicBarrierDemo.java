package com.xinyuan6009.study.thread;

import java.util.HashMap;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.thread
 * @Description: CyclicBarrier使用学习
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/8
 * @Version V1.0
 */
public class CyclicBarrierDemo {


    public static class Soldier implements Runnable{

        private  String name;
        private final CyclicBarrier cyclicBarrier;

        public Soldier(String name, CyclicBarrier cyclicBarrier) {
            this.name = name;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {

            try{
                HashMap map = new HashMap();
            }catch (Exception e){

            }
        }

    }
}
