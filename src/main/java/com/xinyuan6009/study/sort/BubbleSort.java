package com.xinyuan6009.study.sort;

import com.xinyuan6009.study.util.SortUtil;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.sort
 * @Description: 冒泡排序
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/6
 * @Version V1.0
 */
public class BubbleSort {

    public static void sort(int[] a){

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length-i-1;j++){

                if(a[j]<a[j+1]){
                    SortUtil.swap(a,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] a = {3,1,5,2,2,4,9,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
