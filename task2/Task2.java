package task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task2 {

    private static void first(Queue<Integer> que) {
        System.out.println(que.peek());
    }

    private static void dequeue(Queue<Integer> que) {
        System.out.println();
        que.poll();
    }

    private static void enqueue(Queue<Integer> que, Random random) {
        System.out.println();
        int element = random.nextInt(1, 11);
        que.add(element);
        System.out.printf("(enqueue) В очередь добавлен эелемент %d", element);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.println();
        System.out.println("Данная программа работает с очередью и реализует следующие методы:");
        System.out.println();
        System.out.println("==================================================================");
        System.out.println();
        Random random = new Random();
        Queue<Integer> que = new LinkedList<Integer>();
        System.out.println("Созданная пустая очередь: " + que);
        enqueue(que, random);
        enqueue(que, random);
        enqueue(que, random);
        System.out.println();
        System.out.println("Текущая очередь: " + que);
        dequeue(que);
        System.out.print("(dequeue) Очередь после возврата (удаления) элемента: ");
        System.out.println(que);
        System.out.println();
        System.out.print("(first) Возврат элемента на первой позиции в очереди (без удаления): ");
        first(que);
        System.out.println();
        System.out.println("Текущая очередь: " + que);
    }

}