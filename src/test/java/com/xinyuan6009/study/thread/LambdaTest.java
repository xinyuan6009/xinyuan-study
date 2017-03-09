package com.xinyuan6009.study.thread;

import com.xinyuan6009.study.lambda.First;
import com.xinyuan6009.study.lambda.model.AnimalDo;
import com.xinyuan6009.study.model.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Intellij IDEA.
 * @Package com.xinyuan6009.study.thread
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/8
 * @Version V1.0
 */

public class LambdaTest{

    public static void main(String[] args){
        First<String,Integer> first = (from)->Integer.valueOf(from);
        int a = first.convert("1111");

        System.out.println(a);
        Thread t = new Thread(()->System.out.println("Hello"));

    }


    /**
     * Lambda测试
     */
    @Test
    public void testAnimal(){
        animal(()->{
            System.out.println("嚎叫....");
        });

        animal(()->{
            System.out.println("奔跑....");
        });

    }

    @Test
    public void testMethodRel(){
       // Function<String,Integer> fuc = (a)->Integer.parseInt(a);
        Function<String,Integer> fuc = Integer::parseInt;
        System.out.println(fuc.apply("123"));
        List<Integer> weights = Arrays.asList(1,2,4,2,5);

        //表达式方式
        List<Apple> apples = getApples(weights,(w)->new Apple(w));
        List<Apple> apples1 = getApples(weights,Apple::new);

        apples1.sort((a,b)->a.getWeight().compareTo(b.getWeight()));
        apples1.sort(Comparator.comparing((a)->a.getWeight()));
        apples1.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(Arrays.toString(apples1.toArray()));



    }


    /**
     * 复合表达式练习
     */
    @Test
    public void testMutil(){
        List<Integer> weights = Arrays.asList(1,2,4,2,5);

        //表达式方式
        List<Apple> apples = getApples(weights,(w)->new Apple(w));
        //反向排序
        apples.sort(Comparator.comparing(Apple::getWeight).reversed());
        //反向排序后 出现重复 按颜色排序
        apples.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
    }




    private List<Apple> getApples(List<Integer> weights,Function<Integer,Apple> fuc){
        List<Apple> apples = new ArrayList<>();
        for (int weight:weights) {
            apples.add(fuc.apply(weight));
        }
        return apples;
    }



    public void animal(AnimalDo animalDo){
        animalDo.doSomething();
    }
}