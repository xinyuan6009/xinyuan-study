package com.xinyuan6009.study.util;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.util
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/6
 * @Version V1.0
 */
public class SortUtil {

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
}
