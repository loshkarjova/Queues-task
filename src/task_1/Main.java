package task_1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        print();
        output(createQueue());
        output(addNewElement(createQueue()));

    }

    public static void print() {
        System.out.println("Current queue: ");
    }

    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Orange");
        queue.add("Plum");
        queue.add("Peach");
        queue.add("Tomato");
        queue.add("Lemon");
        return queue;
    }

    public static Queue<String> addNewElement(Queue<String> queue) {
        queue.add("Apple");
        System.out.println("\nNew queue: ");
        return queue;
    }

    public static void output(Queue<String> queue) {
        int count = 1;
        for (String element : queue) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
