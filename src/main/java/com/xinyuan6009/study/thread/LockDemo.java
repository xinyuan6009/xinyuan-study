package com.xinyuan6009.study.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.thread
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/2/22
 * @Version V1.0
 */
public class LockDemo {

    private Lock lock = new Lock();
    private int count = 0;

    public int inc() throws InterruptedException {
        lock.lock();
        this.count++;
        lock.unlock();
        return  count;
    }


    public static void main(String[] args) throws InterruptedException {
        LockDemo demo = new LockDemo();
        demo.inc();
    }


}


class Lock{

    //是否锁定标识
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {
        while(isLocked){
            //调用lock的线程开始阻塞
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock(){
        isLocked = false;
        //将调用unlock方法的线程唤醒
        notify();
    }
}

/**
 * 重入锁
 */
class ReenLock{

    //是否锁定标识
    private boolean isLocked = false;
    private Thread lockedThread = null;
    private int count = 0;

    public synchronized void lock() throws InterruptedException {
        Thread callingThread = Thread.currentThread();
        //锁定非锁定线程的其他线程
        while(isLocked&&lockedThread!=callingThread){
            //调用lock的线程开始阻塞
            wait();
        }
        lockedThread =  callingThread;
        isLocked = true;
        count++;
    }

    public synchronized void unlock(){
        if(lockedThread==Thread.currentThread()){
            count--;
            if(count==0){
                isLocked = false;
                //将调用unlock方法的线程唤醒
                notify();
            }
        }

    }
}
