package com.java.edk4;

import java.util.PriorityQueue;
import java.util.Queue;

//program to define a queue interface and have insert and delete methods.
public class QueueOps {

    public static void main(String args[]) {

        Queue<String> pq = new PriorityQueue<>();

        //Adding into the queue
        pq.add("Java");
        pq.add("Spring");
        pq.add("SpringBoot");

        System.out.println("Initial Queue " + pq);

        //Removing from the queue
        pq.remove("Spring");

        System.out.println("After Remove " + pq);

        //Removes the head of the queue
        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
    }

}
