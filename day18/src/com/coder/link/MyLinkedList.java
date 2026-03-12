package com.coder.link;

import java.util.NoSuchElementException;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/10
 */
public class MyLinkedList<E> {
    //结点
    private class Node<E>{
        Node<E> next;//指向后继结点
        E data;//数据元素
        Node<E> previous;//指向前驱结点

        public Node(Node<E> next, E data, Node<E> previous) {
            this.next = next;
            this.data = data;
            this.previous = previous;
        }
    }
    private  Node<E> first;
    private  Node<E> last;
    private int size;

    public MyLinkedList(Node<E> first, Node<E> last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }

    public MyLinkedList() {
    }
    public boolean add(E e){
        Node<E> l=last;
        Node<E> newNode=new Node<>(null,e,l);
        last=newNode;
        if(l==null){
            first=newNode;
        }else{
            l.next=newNode;
        }
        size++;
        return true;
    }
    public void add(int index,E e){
        if(index==0) {
            first = new Node<>(first, e, null);
        }else {
            Node<E> prev=node(index-1);
            Node<E> next=prev.next;
            Node<E> newNode=new Node<>(next,e,prev);
            prev.next=newNode;
        }
        size++;
    }
    Node<E> node(int index){
        Node<E>x=first;
        for (int i = 0; i < index; i++) {
            x=x.next;
        }
        return x;
    }
    public E get(int index){
        return node(index).data;
    }
    public int size(){
        return size;
    }
    public E getFirst(){
        if(first==null)
            throw new NoSuchElementException();
        return first.data;
    }
    public E getLast(){
        if(last==null)
            throw new NoSuchElementException();
        return last.data;
    }
    public E remove(int index){
        Node<E> node=first;
        if(index==0){
            first=node.next;
        }else{
            Node<E> prev=node(index-1);
            node=prev.next;
            prev.next=node.next;
        }
        size--;
        return node.data;
    }
}
