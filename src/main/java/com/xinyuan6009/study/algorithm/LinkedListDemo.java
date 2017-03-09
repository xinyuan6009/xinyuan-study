package com.xinyuan6009.study.algorithm;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan6009.study.algorithm
 * @Description: 链表操作
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/8
 * @Version V1.0
 */
public class LinkedListDemo {


    private Node nodeList;

    /**
     * 将节点追加到列表最后
     * @param node
     */
    public void add(Node node){

        if(nodeList==null){
            nodeList = node;
            return;
        }

        nodeList.setNext(node);
    }


    /**
     * 删除节点
     * @param node
     */
    public void del(Node node){
        //尾节点
        if(node.getNext()==null){
            node = null;
            return;
        }

        node.setNext(node.getNext().getNext());
        node.setValue(node.getNext().getValue());
    }


    /**
     * 获取单向链表倒数第K个节点
     * @param k
     */
    public Node getBackKNode(int k){

        return null;
    }







}
