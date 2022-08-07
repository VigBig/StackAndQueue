package com.bridgelabz.stackandqueue;

public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue");

        System.out.println("UC1: Pushing elements 70,30,56 into Stack : ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Printing elements of Stack : ");
        linkedList.displayStack();

        System.out.println("UC2: Peeking and Popping elements of Stack : ");
        System.out.println("Peeking top of stack : ");
        linkedList.peek();
        System.out.println("Popping top of stack... ");
        linkedList.pop();
        System.out.println("Printing elements of Stack : ");
        linkedList.displayStack();
        System.out.println("Peeking top of stack : ");
        linkedList.peek();
        System.out.println("Popping top of stack... ");
        linkedList.pop();
        System.out.println("Printing elements of Stack : ");
        linkedList.displayStack();
        System.out.println("Peeking top of stack : ");
        linkedList.peek();
        System.out.println("Popping top of stack... ");
        linkedList.pop();
        System.out.println("Printing elements of Stack : ");
        linkedList.displayStack();

        System.out.println("UC3: Enqueueing elements 70,30,56 into Queue : ");
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.enqueue(56);
        linkedList2.enqueue(30);
        linkedList2.enqueue(70);
        System.out.println("Printing elements of Queue : ");
        linkedList2.displayQueue();

    }
}
