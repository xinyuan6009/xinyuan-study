package com.xinyuan6009.study.sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.sort
 * @Description: 插入排序算法 从数组第一个位置开始，将其后面的每一个元素插入到之前的数组中
 * 是的被插入的数组是有序数列
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/2/28
 * @Version V1.0
 */
public class Insert {

    public static int[] sort(int[] arr){

        for(int i=0;i< arr.length-1;i++){

            int bef = arr[i];
            int j = i+1;
            //开始执行插入  插入要点，获取当前值，获取前一个值，对比 交换
            while(j>0&&arr[j]<bef){
                int tmp = arr[j];
                arr[j] = bef;
                arr[j-1] = tmp;
                if(j>1){
                    bef = arr[j-2];
                }else{
                    bef = tmp;
                }

                j--;
            }
        }
        return arr;
    }



    public static void main(String[] args){
        int[] arr = {11,3,9,7,12,10};

        arr = sort(arr);

        String arrStr = Arrays.toString(arr);

        System.out.println(arrStr);
    }

}
