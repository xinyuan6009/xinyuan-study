package com.xinyuan6009.study.thread;

import org.junit.Test;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.thread
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/2/15
 * @Version V1.0
 */
public class ProductConsumeTester {

    //@Test
    public  void play(){
        ProductConsume productConsume = new ProductConsume();
        productConsume.play();
    }

    public static void main(String[] args){
        ProductConsume productConsume = new ProductConsume();
        productConsume.play();
    }
}
