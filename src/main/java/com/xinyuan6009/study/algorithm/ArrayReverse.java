package com.xinyuan6009.study.algorithm;

import com.xinyuan6009.study.util.SortUtil;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.algorithm
 * @Description: 数组转置
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/9
 * @Version V1.0
 */
public class ArrayReverse {


    /**
     * 给定一个数值K，将数组arr中的每k个元素颠倒
     * 当数组剩余元素不足K值时，剩余元素不颠倒
     * @param arr
     * @param k 颠倒因子  不大于数组长度
     */
    public void reverse(int[] arr,int k){

        //参数异常
        if(arr==null||arr.length<1){
            return;
        }

        //K值超限
        if(k>arr.length){
            return;
        }


        //蒙版游标
        int index = 0;
        int i = 0;
        while (index+k<=arr.length){
            int j=i+k-1;
            index = j;
            for(;j<arr.length;j--){
                if(i<j){
                    SortUtil.swap(arr,i,j);
                    i++;
                }else {
                    break;
                }

            }
            i = index+1;
        }


    }

    /**
     * 给定一个数值K，将数组arr中的每k个元素颠倒
     * 当数组剩余元素不足K值时，剩余元素仍然颠倒
     * @param arr
     * @param k 颠倒因子  不大于数组长度
     */
    public void reverseAll(int[] arr,int k){

        //参数异常
        if(arr==null||arr.length<1){
            return;
        }

        //K值超限
        if(k>arr.length){
            return;
        }


        int index = 0;
        int i = 0;
        while (true){
            int j=i+k-1;
            index = j;
            for(;;j--){
                if(j>arr.length-1){
                    j= arr.length-1;
                }
                if(i<j){
                    SortUtil.swap(arr,i,j);
                    i++;
                }else {
                    break;
                }

            }
            i = index+1;
            if(i>arr.length-1){
                break;
            }
        }


    }

    public static void main(String[] args) {
        ArrayReverse arrayReverse = new ArrayReverse();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i=5;i<arr.length;i++){
            int[] arrCopy = Arrays.copyOf(arr,arr.length);
            arrayReverse.reverseAll(arrCopy,i+1);
            System.out.println("K="+(i+1)+" 倒置结果:"+Arrays.toString(arrCopy));
        }

        System.out.println("---------------------");
        arrayReverse.reverse(arr,3);
        System.out.println(Arrays.toString(arr));

    }
}
