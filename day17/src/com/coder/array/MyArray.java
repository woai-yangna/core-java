package com.coder.array;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/11
 */
public class MyArray {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY=10;
    private static final Object[] EMPTY_ELEMENTDATA={};
    public MyArray(){
        elementData=new Object[DEFAULT_CAPACITY];
    }

    public  MyArray(int initialCapacity){
        if(initialCapacity>0){
            elementData=new Object[initialCapacity];
        }else if(initialCapacity==0){
            elementData=EMPTY_ELEMENTDATA;
        }else{
            throw new IllegalArgumentException("数组参数异常"+initialCapacity);
        }
    }
    public int size(){
       return size;
    }

    public  boolean add(Object obj){
        add(obj,elementData,size);
        return true;
    }
    public void add(Object obj,Object[] elementData,int s){
        if(s==elementData.length){
            elementData=grow();
        }
        elementData[s]=obj;
        size=s+1;
    }
    public Object[] grow(){
        return elementData= Arrays.copyOf(elementData,elementData.length+(elementData.length>>1));
    }
    //获取元素
    public Object get(int index){
        if(index<elementData.length){
        return elementData[index];
        }else{
            throw new IllegalArgumentException("索引长度异常");
        }
    }
    //清除集合中所有元素
    public void clear(){
        int t0=size;
        size=0;
        for (int i = 0; i < size; i++) {
            elementData[i]=null;
        }
    }
}
