package com.xinyuan6009.study.lambda;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.lambda
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/8
 * @Version V1.0
 */
public interface First<F,T> {

    T convert(F from);


    default void test(){

    }
}
