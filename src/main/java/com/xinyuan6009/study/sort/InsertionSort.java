package com.xinyuan6009.study.sort;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.sort
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/2
 * @Version V1.0
 */
public class InsertionSort {

    /**
     * 插入排序
     * @param arr
     */
    public static void sort(int[] arr){

        for(int i=1;i<arr.length;i++){
            //获取待插入的值
            int data = arr[i];
            int j=i-1;
            for(;j>=0;j--){
                //正序
                if(arr[j]>data){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=data;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {11,3,9,7,12,10};

        sort(arr);

        ConcurrentHashMap map = new ConcurrentHashMap();
        Thread t = new Thread( new Runnable() {
            @Override
            public void


            run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Test-Thread");

        Thread t1 = new Thread( new Runnable() {
            @Override
            public void


            run() {
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Test-Thread1");
        t.start();
        t1.start();
        t.join();
        t1.join();
        String arrStr = Arrays.toString(arr);

        System.out.println(arrStr);
    }



}
