package com.bridgelabz.stackandqueue;

public class LinkedList<E> {
    Node<E> top;
    Node<E> front;
    Node<E> rear;

    public void enqueue(E key) {
        Node<E> newNode=new Node<>(key);
        if(rear==null){
            front=newNode;
            rear=newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void push(E key){
        Node<E> newNode = new Node<>(key);

        if(top == null){

            top = newNode;

        }else{

            newNode.next = top;
            top = newNode;

        }

    }

    public void displayQueue(){

        Node<E> temp = front;

        if(front==null){
            System.out.println("Queue is empty");
        }

        while (temp != null) {
            System.out.print(temp.key);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public void displayStack(){

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

    public void dequeue() {

        front = front.next;

    }
}
