package com.xinyuan6009.study.lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.lang
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/2/18
 * @Version V1.0
 */
public class IntDemo {

    public static void main(String[] args) throws InterruptedException {
        Integer a = 1;
        Integer b = 1;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a==b);
        System.out.println(c==d);

        Thread.sleep(50000);


        List<String> str = new ArrayList<String>();
        str.add("aaa");

    }
}
