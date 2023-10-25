import java.util.Queue;
public class QueueLinkedListADT {
    // add Queue
    public static void queueAdd(Queue<String> queue){
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        queue.add("lemon");
        System.out.println("Queue "+queue);
    }

    // offer Queue
    public static void queueOffer(Queue<Integer> queue){
        for (int i = 0; i <= 10; i++){
            queue.offer(i);
        }
        System.out.println("Queue LinkedList : "+queue);
    }
    //peek Queue
    public static void queuePeek(Queue<Integer> queue){
        int accessElement = queue.peek();
        System.out.println("AccessElement Queue LinkedList : " + accessElement);
        System.out.println("Queue LinkedList : "+ queue);
    }

    // poll queue : remove element in Queue
    public static void queueRemoveByIndex(Queue<Integer> queue, int index){
        queue.remove(index);
        System.out.println("Queue LinkedList : "+queue);
    }
    // Search element in Queue
    public static void queueSearch(Queue<Integer> queue, int index){
        boolean findElement = queue.contains(index);
        if (findElement==false){
            System.out.println("Not Empty");
        }else {
            System.out.println("Empty");
        }
    }
    // for ... Queue
    public static void forQueue(Queue<Integer>queue){
        for(int j: queue){
            System.out.println("For Queue : " + j);
        }
    }

}
