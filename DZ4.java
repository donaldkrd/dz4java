import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        // task1:
        // LinkedList<Integer> list = createRandList();
        // System.out.println("Исходный список " + list);
        // list = turnList(list);
        // System.out.println("Первый метод " + list);
        // list = turnList2(list);
        // System.out.println("Второй метод " + list);

        // task2();

        // task3:
        // LinkedList<Integer> list = createRandList();
        // System.out.println(list);
        // System.out.println("Через for each: " + sumList(list));
        // System.out.println("Через итератор: " + sumIterator(list));
    }

    static LinkedList<Integer> createRandList() {
        LinkedList<Integer> listStart = new LinkedList<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите размер списка: ");
        int length = scan.nextInt();
        scan.close();
        for (int i = 0; i < length; i++) {
            listStart.add(rand.nextInt(100));
        }
        return listStart;
    }

    static LinkedList<Integer> turnList(LinkedList<Integer> list) {
        
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список.
        
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    static LinkedList<Integer> turnList2(LinkedList<Integer> list) {
        
        //  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        //  вернет “перевернутый” список.
        
        Collections.reverse(list);
        return list;
    }

    static void task2() {
        Queue<Integer> queue = new LinkedList<>();
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.enqueue(queue, 1); 
        myLinkedList.enqueue(queue, 2); 
        myLinkedList.enqueue(queue, 3); 
        myLinkedList.enqueue(queue, 4); 
        myLinkedList.enqueue(queue, 5); 
        myLinkedList.enqueue(queue, 6); 
        System.out.println("Очередь: " + queue); 
        int number = myLinkedList.dequeue(queue);
        System.out.println("Присвоен первый элемент очереди = " + number); 
        System.out.println("Первый элемент очереди удален " + queue); 
        System.out.println("Первый элемент очереди = " + myLinkedList.dequeue(queue)); 
                                                                                    
        System.out.println("Первый элемент очереди удален " + queue); 
        int num = myLinkedList.first(queue); 
        System.out.println("Присовен первый элемент очереди " + num); 
        System.out.println("Первый элемент очереди не удален " + queue); 
        System.out.println("Присовен первый элемент очереди " + myLinkedList.first(queue)); 
        System.out.println("Первый элемент очереди не удален " + queue); 
    }

    static int sumList(LinkedList<Integer> list) {

        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;

    }

    static int sumIterator(LinkedList<Integer> list) {
        int sum = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        return sum;
    }
}