package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {
    private java.util.Queue linkedListQueue;
    private java.util.Queue priorityQueue;

    public Queue() {
        linkedListQueue = new LinkedList();
        priorityQueue = new PriorityQueue();
        addElements();
    }

    private void addElements() {
        String[] names = {"Amit", "Bharat", "Chitra", "Deepak", "Esha", "Farhan", "Geeta", "Hiren", "Isha", "Jay"};
        for (String name : names) {
            linkedListQueue.add(name);
            priorityQueue.add(name);
        }
    }

    public java.util.Queue getLinkedListQueue() {
        return linkedListQueue;
    }

    public java.util.Queue getPriorityQueue() {
        return priorityQueue;
    }

    public void displayQueues() {
        System.out.println("LinkedList Queue:");
        Iterator it = linkedListQueue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("Priority Queue:");
        it = priorityQueue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
