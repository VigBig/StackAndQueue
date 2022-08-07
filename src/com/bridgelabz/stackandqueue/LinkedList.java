package com.bridgelabz.stackandqueue;

public class LinkedList<E> {

    Node<E> top;

    public void push(E key){
        Node<E> newNode = new Node<>(key);

        if(top == null){

            top = newNode;

        }else{

            newNode.next = top;
            top = newNode;

        }

    }


    public void display(){

        Node<E> temp = top;

        if(top==null){
            System.out.println("Stack is empty");
        }

        while(temp!=null){
            System.out.println(" "+ temp.key);
            temp = temp.next;
            if(temp!=null) {
                System.out.println(" ^");
                System.out.println(" |");
            }

        }
        System.out.println();
    }

    public void peek() {
        System.out.println(top.key);
    }

    public void pop() {

        top = top.next;

    }
}
