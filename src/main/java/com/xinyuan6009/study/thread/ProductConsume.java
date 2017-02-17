package com.xinyuan6009.study.thread;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.thread
 * @Description: 生产者消费者学习实例  存在严重问题 待解决
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/2/15
 * @Version V1.0
 */
public class ProductConsume {

    //最大产品数
    private Integer MAX_PRODUCT=100;
    //最小产品数
    private Integer MIN_PRODUCT=10;

    //实际产品数
    private Integer products=0;

    /**
     * 生产者
     */
    public synchronized void produce(){
        while(this.products>=MAX_PRODUCT){
            try {
                System.out.println("产品已经满了，请先消费...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.products++;
        notifyAll();
        System.out.println(Thread.currentThread().getName()+" 生产剩余"+products);

    }

    /**
     * 消费者
     */
    public synchronized void consume(){
        while(this.products<=MIN_PRODUCT){
            try {
                System.out.println("产品已经不足，请先生产...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        this.products--;
        notifyAll();
        System.out.println(Thread.currentThread().getName()+" 消费剩余"+products);

    }


    public void play(){
        System.out.println("start playing..........");
        //构建生产者
        Runnable pJob = new Runnable() {
            @Override
            public void run() {
                while (true){
                    produce();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        //构建生产者
        Runnable cJob = new Runnable() {
            @Override
            public void run() {
                while (true){
                    consume();
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(pJob).start();
        new Thread(cJob).start();
        new Thread(cJob).start();


    }
}
