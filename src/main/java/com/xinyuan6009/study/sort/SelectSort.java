package com.xinyuan6009.study.sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.sort
 * @Description: 选择排序，选出数列中最值，然后与第一个元素交换，再从之后的
 * 数组中选出第二最值与第二元素交换，直到数组中所有元素都排好序为止
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/3
 * @Version V1.0
 */
public class SelectSort {

    public static void sort(int[] arr){

        if(arr==null||arr.length<1){
            return ;
        }

        for(int i=0;i<arr.length;i++){

            int min = arr[i];
            int lowest = i;

            for(int j=i;j<arr.length;j++){

                if(min>arr[j]){
                    min = arr[j];
                    lowest = j;
                }
            }

            //交换
            int tmp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = tmp;

        }
    }



    public static void main(String[] args){
        int[] a = {3,1,5,7,2,4,9,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
