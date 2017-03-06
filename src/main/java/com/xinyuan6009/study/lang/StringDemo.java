package com.xinyuan6009.study.lang;

import java.util.HashMap;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.lang
 * @Description: 字符串相关学习记录
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/2/17
 * @Version V1.0
 */
public class StringDemo {


    public static void main(String[] args){
        //字符串常量
        String str1 = "XINyuan";
        String str2 = "XINyuan";
        String str3 = "XINyuan";


        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);

        System.out.println("------------");
        StringDemo demo = new StringDemo();
        demo.test1();
        StringBuilder sb = new StringBuilder();
        sb.toString();
    }

    String a = "a";
    final String b = "b";
    String c = "c";
    String getA(){
        return "a";
    }


    private void test1(){
        //a是变量，在运行期间赋值，因此在运行期间 a会在heap中new一个对象
        System.out.println("a"+b=="ab");
        System.out.println(a+"b"=="ab");
        System.out.println(a+b=="ab");
        new StringBuilder(1).append("aa");
    }
}
