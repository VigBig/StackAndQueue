package com.bridgelabz.stackandqueue;

public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue");

        System.out.println("Pushing elements 70,30,56 into Stack : ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Printing elements of Stack : ");
        linkedList.display();

    }
}
