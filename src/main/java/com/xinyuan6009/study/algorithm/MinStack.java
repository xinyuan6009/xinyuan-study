package com.xinyuan6009.study.algorithm;

import java.util.Stack;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.algorithm
 * @Description: 带有min函数的栈
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/9
 * @Version V1.0
 */
public class MinStack {

    //最小值栈
    private Stack<Integer> stack_min = new Stack<>();
    //数据栈
    private Stack<Integer> stack_data = new Stack<>();


    /**
     * 插入
     * @param num
     */
    public void push(Integer num){

        if(stack_min.size()<1){
            stack_min.push(num);
            stack_data.push(num);
            return;
        }

        if(num<min()){
            stack_min.push(num);
        }

        stack_data.push(num);
    }

    /**
     * 弹出
     * @return
     */
    public Integer pop(){
        //没有数据
        if(stack_data.size()<1){
            return null;
        }

        int num = stack_data.pop();
        if(num == min()){
            stack_min.pop();
        }

        return num;
    }


    /**
     * 查找
     * @return
     */
    public int min(){
        return stack_min.peek();
    }
}
