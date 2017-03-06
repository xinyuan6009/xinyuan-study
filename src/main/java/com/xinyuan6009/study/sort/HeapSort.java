package com.xinyuan6009.study.sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.sort
 * @Description: 堆排序
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/6
 * @Version V1.0
 */
public class HeapSort {



    public static void sort(int[] arr){

        int heapSize = 0;
        for(int i=0;i<arr.length;i++){
            heapSize = arr.length-1-i;
            buildHeap(arr,heapSize);
            swap(arr,0,heapSize);
        }
    }


    /**
     * 构建堆 最大堆
     * 从末节点向根节点排序
     * @param arr
     * @param heapSize
     */
    public static void buildHeap(int[] arr,int heapSize){

        for(int i=heapSize/2;i>=0;i--){
            int left = 2*i+1;
            int right = 2*i+2;

            if(left<=heapSize&&arr[i]<arr[left]){
                swap(arr,i,left);
            }

            if(right<=heapSize&&arr[i]<arr[right]){
                swap(arr,i,right);
            }
        }
    }


    /**
     * 数组交换
     * @param arr
     * @param index1
     * @param index2
     */
    public  static void swap(int[] arr,int index1,int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }


    public static void main(String[] args){
        int[] a = {3,1,5,2,2,4,9,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
