package com.xinyuan6009.study.algorithm;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.algorithm
 * @Description: 列表节点
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/8
 * @Version V1.0
 */
public class Node {

    //头节点
    private Node head;

    private Node next;
    private Node pre;
    private String value;




    /**
     * 获取单向链表倒数第K个节点
     * @param k
     */
    public Node getBackKNode(int k){

        //定义两个指正，都指向头结点
        Node  slow,fast;
        slow=fast= head;

        //将快指正前移K个长度
        for(int i=0;i<k;i++){
            if(fast!=null){
                fast = fast.next;
            }
        }

        //将两个指针同时前移
        while(fast != null){
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return slow;

    }









    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
