package com.api.openBank.algos;

/**
 * programmer: austine wamalwa
 * email: austinwamalwa18@gmail.com
 * implementation of an integer based stack in java
 */

class StackArray {
    private int size;
    private int[] arr;
    private int top;

    StackArray (int size){
        this.size= size;
        this.arr = new int[size];
        this.top =-1;
    }

    public void push(int item){
        if (isFull()){
            throw new RuntimeException("The stack is full");
        }else {
            arr[++top] = item;
        }
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("The stack is Empty");
        }else {
            return arr[top--];
        }
    }
    public int peek(){

        return arr[top];
    }
    public boolean isFull(){
        return top == size-1;
    }
    public boolean  isEmpty(){
        return top == -1;

    }

    public static void main (String[] args){
        StackArray stackArray=new StackArray(4);
        stackArray.push(3);
        stackArray.push(1);
        stackArray.push(6);
        stackArray.push(4);
        stackArray.push(5);
//        for (int i=0;i<stackArray.size;i++){
//            stackArray.pop();
//        }

        System.out.println(stackArray.pop());

    }
}
